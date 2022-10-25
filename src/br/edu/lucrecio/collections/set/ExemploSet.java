package br.edu.lucrecio.collections.set;

//      PRINTS COMENTANDOS SAO EM ALUSAM A IMPOSSIBILIDADE DA INTEFACE SET/HASH SET EXECUTAR TAIS AÇÕES

import java.util.*;

public class ExemploSet {

    public static void main(String[] args) {
//      PRINTS COMENTANDOS SAO EM ALUSAM A IMPOSSIBILIDADE DA INTEFACE SET/HASH SET EXECUTAR TAIS AÇÕES

        System.out.println("Crie um conjunto e adicione as Notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        //System.out.println("Exiba a posição da nota 5.0: "); //não é possivel pôs em Hash as ondem sap aleatorias

//        System.out.println("Adiciona na lista a not 8.0 na posição 4");

//        System.out.println("Substituia a noa 6 pela nota 5");

        System.out.println("Confira se a nota 5 estã no conjunto: " + notas.contains(5d));

//        System.out.println("Exiba a terceira nota adicionada");

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while(iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma é: " + soma);

        System.out.println("Exiba a media das notas: " + (soma / notas.size()));

        System.out.println("Remova notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);


    }

}
