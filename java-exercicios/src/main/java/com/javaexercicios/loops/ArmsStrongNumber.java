package com.javaexercicios.loops;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Log4j2
public class ArmsStrongNumber {

    // 371 sao tres algarismo
    // 3³ = 27 | 7³ = 343    | 1³ = 1
    // 27 + 343 + 1 = 371


    public static void main(String[] args) {

        int numero = 371;
        int contador = 0;

        String numeroString = Integer.toString(numero);

        char p1 = numeroString.charAt(0);
        char p2 = numeroString.charAt(1);
        char p3 = numeroString.charAt(2);


        int pp1 = Character.getNumericValue(p1);
        int pp2 = Character.getNumericValue(p2);
        int pp3 = Character.getNumericValue(p3);

        List<Integer> positions = new ArrayList<>();
        positions.add(pp1);
        positions.add(pp2);
        positions.add(pp3);

        double valorPow = 0.0;

        ArrayList<Double> valorExpoente = new ArrayList<>();

        for (Integer p : positions) {
            valorPow = Math.pow(p, 3);
        //    System.out.println(valorPow);
            valorExpoente.add(valorPow);
        }
        //log.info(valorExpoente);

        double somaDosExpoente = valorExpoente.get(0) + valorExpoente.get(1) + valorExpoente.get(2);
       // log.info(somaDosExpoente);


        if(somaDosExpoente == numero)
            System.out.println("ESSE NUMERO E UM ARMSTRONG");
        else System.out.println("Nao e um armstrong");

    }

}



