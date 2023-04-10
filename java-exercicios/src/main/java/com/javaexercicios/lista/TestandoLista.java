package com.javaexercicios.lista;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoLista {

    public static void main(String[] args) {
        String aula1 = "MAT";
        String aula2 = "PORT";
        String aula3 = "ESTAT";
        String aula4 = "RLM";


        ArrayList<String> aulas = new ArrayList();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);

        System.out.println();
        System.out.println("As aulas sao: " + aulas);
        System.out.println();

        for (String aula: aulas  // Para cada String aula : em ArrayList aulas
             ) {
            System.out.println("Aula: " + aula);
        }

        System.out.println();

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula eh : " + primeiraAula);

        System.out.println();

        aulas.forEach(aula -> {                    //Para cada referencia ao Objeto aula, -> faca print ln
            System.out.println("Percorrendo: ");
            System.out.println("Aula: " + aula);
        });

        //ordernar colecoes

        System.out.println();

        Collections.sort(aulas);
        System.out.println(aulas);  //[ESTAT, MAT, PORT, RLM]


    }

}
