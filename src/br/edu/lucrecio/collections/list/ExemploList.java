package br.edu.lucrecio.collections.list;

import java.util.ArrayList;
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



    }
}