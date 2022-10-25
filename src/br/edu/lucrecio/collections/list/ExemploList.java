package br.edu.lucrecio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        //Dada uma lista com 7 notas de uma estudante [7, 8.5, 9.3, 5. 7, 0, 3.6;

        System.out.println("Crie uma lista e adicione as 7 notas: ");

        List<Double> notas = new ArrayList<>(); //Generics jdk 5, - Diomond Operator jdk 7
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a poisição da nota 5.0: "); //indexOf
        System.out.println("A nota 5.0 estã na posição: "  + notas.indexOf(5.0));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Subistitua a nota 5.0 pela nota 6.0: "); // set (posição, valor)
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d) ); //contains

/*        System.out.println("Imprima as notas uma a baixo da outra: ");
        for (Double nota: notas) System.out.println(nota);*/

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); // get
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota " + Collections.min(notas)); // Collections.min(collection)

        System.out.println("Exiba a maior nota: " + Collections.max(notas)); //Collections.max(collection)

        System.out.println("Exiba a soma dos valores"); // iterator()
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma dos valores da lista é: " + soma);

        System.out.println("Exiba a media das notas do aluno " + (soma / notas.size())); // size()

        System.out.println("Remova a nota 0.0"); //remove( objeto ou indice )
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista "); // .clear()
        notas.clear();

        System.out.println("Confira se a lista esta vazia "); // isEmpty()
        System.out.println(notas.isEmpty());


    }
}
