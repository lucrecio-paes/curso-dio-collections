package br.edu.lucrecio.collections.list;
//Dado as seguintes informações sobre meus cachorros, crie uma lista e ordene esta lista exibindo
//// (nome - idade - cor);
//Cão 1 = Irineu, 3 anos, Amerelo
//Cão 2 = Eslo, 8 meses, Preto
//Cão 3 = Mel, 10 anos, Branca

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenandoLists {
    public static void main(String[] args) {

        List<Cachorro> meusCachorros = new ArrayList<>(){{
            add(new Cachorro("Irineu", 2, "Amarelo"));
            add(new Cachorro("Eslo", 8, "Preta"));
            add(new Cachorro("Mel", 10, "Branca"));
        }};

        System.out.println("Na ordem de inserção");
        System.out.println(meusCachorros);

        System.out.println("Na Ordem aleatoria"); // Collections.shuffle
        Collections.shuffle(meusCachorros);
        System.out.println(meusCachorros);

        System.out.println("Ordem natural (nome) "); //utilizando a interface Comparable
        Collections.sort(meusCachorros);
        System.out.println(meusCachorros);

        System.out.println("Ordem natural (idade)"); //utlizando a interface COMPARATOR
//        Collections.sort(meusCachorros, new ComparatorIdade());
        meusCachorros.sort(new ComparatorIdade());
        System.out.println(meusCachorros);

        System.out.println("Ordem natural (cor)");
        meusCachorros.sort(new ComparatorCor());
        System.out.println(meusCachorros);

        System.out.println("Ordem por nome, cor, idade");
        meusCachorros.sort(new ComparatorCorNomeIdade());
        System.out.println(meusCachorros);
    }
}

class Cachorro implements Comparable<Cachorro>{
    private String nome;
    private Integer idade;
    private String cor;


    public Cachorro(String nome, Integer idade, String cor ) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cachorro cachorro) {
        return this.getNome().compareToIgnoreCase(cachorro.getNome());
    }
}

class ComparatorIdade implements Comparator<Cachorro>{
    @Override
    public int compare(Cachorro c1, Cachorro c2) {
        return Integer.compare(c1.getIdade(), c2.getIdade());
    }
}

class ComparatorCor implements Comparator<Cachorro>{

    @Override
    public int compare(Cachorro c1, Cachorro c2) {
        return c1.getCor().compareToIgnoreCase(c2.getCor());
    }
}

class ComparatorCorNomeIdade implements Comparator<Cachorro>{
    @Override
    public int compare(Cachorro c1, Cachorro c2) {
        int nome = c1.getNome().compareToIgnoreCase(c2.getNome());
        if(nome != 0) return nome;

        int cor =  c1.getCor().compareToIgnoreCase(c2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(c1.getIdade(),c2.getIdade());
    }
}