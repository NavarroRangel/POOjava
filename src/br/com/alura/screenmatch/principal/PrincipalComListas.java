package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefão", 1980);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2000);
        outroFilme.avalia(2);
        var filmeFilmeDoPaulo = new Filme("Dogville", 1978);
        filmeFilmeDoPaulo.avalia(9);
        Serie lost = new Serie("LOST", 2000);

        Filme f1 = filmeFilmeDoPaulo;
        System.out.println(f1.getNome());

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeFilmeDoPaulo);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Ziraldo");
        buscaPorArtista.add("Robinho");
        buscaPorArtista.add("Steven Seagal");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação!");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de títulos ordenados:");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
