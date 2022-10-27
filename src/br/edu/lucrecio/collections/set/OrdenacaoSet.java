package br.edu.lucrecio.collections.set;

//Dadas a seguintes informações sobre as minha séries favoritas
//crie um conjunto e ordene este conjunto exibindo:
//        (nome - genero - tempo de episodio)

//Serie 1 - nome: Ted Lasso, genero: Comédia, tempoEpisodio: 30;
//Serie 2 - nome: Aneis de Poder, genero: Fantasia, tempoEpisodio: 50;
//Serie 3 - nome: Casa do Dragão, genero: Fantasia, tempoEpisodio: 50;

import java.util.*;

public class OrdenacaoSet {
    public static void main(String[] args) {

        //criar coleção


        System.out.println("Ordem aleatoria <HashSet>");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Ted Lasso", "Comédia", 30));
            add(new Serie("Casa do Dragão", "Fantasia", 50));
            add(new Serie("Anéis de Poder", "Fantasia", 50));
        }};
        for (Serie serie : minhasSeries) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("Ordem de Inserção <LinkedHashSet>");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Ted Lasso", "Comédia", 30));
            add(new Serie("Casa do Dragão", "Fantasia", 50));
            add(new Serie("Anéis de Poder", "Fantasia", 50));
        }};
        for (Serie serie : minhasSeries1) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());


        System.out.println("Ordem Natural Tempo de Episosio");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
}







