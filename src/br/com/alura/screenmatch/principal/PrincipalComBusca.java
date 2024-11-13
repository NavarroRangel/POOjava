package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelo.Titulo;
import br.com.alura.screenmatch.modelo.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting() // Adiciona formatação ao JSON para facilitar a leitura
                .create();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite um filme para busca:");
            busca = leitura.nextLine();
            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            var key = "7313a25e";
            String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=" + key;
            System.out.println("Endereço de busca: " + endereco);

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println("Resposta JSON: " + json);

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println("Objeto TituloOmdb: " + meuTituloOmdb);

                try {
                    Titulo meuTitulo = new Titulo(meuTituloOmdb);
                    System.out.println("Objeto Titulo convertido: " + meuTitulo);

                    titulos.add(meuTitulo);
                } catch (ErroDeConversaoDeAnoException e) {
                    System.out.println("Erro de conversão de ano: " + e.getMensagem());
                }

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro de argumento, verifique o endereço.");
            }
        }

        System.out.println("Lista de Títulos: " + titulos);

        try (FileWriter escrita = new FileWriter("filmes.json")) {
            gson.toJson(titulos, escrita);
            System.out.println("Arquivso filmes.json escrito corretamente!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
