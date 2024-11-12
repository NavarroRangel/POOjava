package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefão",1980);
        meuFilme.setDuracaoEmMinutos(260);



        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(8);
        meuFilme.avalia(8);
        System.out.println("total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


        Serie lost = new Serie("LOST",2000);

        lost.exibeFichaTecnica();
        lost.setTemporadas(19);
        lost.setEpisodioPorTemporada(12);
        lost.setMinutosPorEpisodio(50);
        System.out.println(lost.getDuracaoEmMinutos());

    Filme outroFilme = new Filme("avatar",2000);

        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(outroFilme);
        calculadoraDeTempo.inclui(lost);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(0);
        filtro.filtra(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("tamanho da lista " + listaDeFilmes.size());
        System.out.println("primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes.get(0).toString());

        var filmeFilmeDoPaulo = new Filme("dogville",1978);


    }

}
