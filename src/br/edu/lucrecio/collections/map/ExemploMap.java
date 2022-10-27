package br.edu.lucrecio.collections.map;

import java.util.*;

public class ExemploMap {

    public static void main(String[] args){
    //Dado os modelos de carros e seus respectivos consumos na estrada faça:
    //    modelo: gol consumo: 14.4 km/L
    //    modelo: uno consumo: 15.6 km/l
    //    modelo: mobi consumo: 16.1 km/l
    //    modelo: hb20 consumo: 14.5 km/l
    //    modelo: kwid consumo: 15.6 km/l
        System.out.println("Crie um dicionario que relacione os carros e seus recpetivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Subistitua o consumo do gol por 15,2 km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o mode Fuska está no dicionario: " + carrosPopulares.containsKey("fuska"));

        System.out.println("Confira o consumo do uno: " + carrosPopulares.get("uno"));

//        System.out.println("Exiba o terceiro modelo adicionado");

        System.out.println("Exiba os modelos"); //keyset
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros");
        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);

        System.out.println("Exiba o modelo mais economico");
        Double consumoMaisEconomico = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEconomico = "";
        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(consumoMaisEconomico))
                modeloMaisEconomico = entry.getKey();
        }
        System.out.println(modeloMaisEconomico);

        System.out.println("Exiba o modelo menos economico");
        Double consumoMenosEconomico = Collections.min(carrosPopulares.values());
        String modeloMenosEconomico = "";
        for (Map.Entry<String, Double> entry: entries ) {
            if(entry.getValue().equals(consumoMenosEconomico))
                modeloMenosEconomico = entry.getKey();
            System.out.println(modeloMenosEconomico);
        }

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("exiba a media de consumos deste dicionario " + (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com consumo igual a 15.6 km/l");
        carrosPopulares.values().removeIf(aDouble -> aDouble.equals(15.6));
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem que foram informados");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("Exiba o Dicionario Ordenado pelo Modelo");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        System.out.println("Apague os Dicionarios de Carros");
        carrosPopulares.clear();
        carrosPopulares1.clear();
        carrosPopulares2.clear();

        System.out.println("Confira se o dicionario está vazio: " + carrosPopulares2.isEmpty());

    }



    }

