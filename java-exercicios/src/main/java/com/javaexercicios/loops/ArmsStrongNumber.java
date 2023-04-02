package com.javaexercicios.loops;

import java.util.List;

public class ArmsStrongNumber {

    // 371 sao tres algarismo
    // 3³ = 27 | 7³ = 343    | 1³ = 1
    // 27 + 343 + 1 = 371



    public static void main(String[] args) {

        int numero = 371;
        int contador = 0;

        while(numero != 0){
            numero = numero / 10;
            contador++;
        }

        System.out.println(contador);
    }

}
