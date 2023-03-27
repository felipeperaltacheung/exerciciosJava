package com.javaexercicios.loops;

public class Potencia {

    public static void main(String[] args) {


    double base = 3;
    double expoente = 2;
    double resultado = base;

    for (double i = 0; i < expoente; i++){
        System.out.println(resultado);
        resultado *=  base;
    }



    }
}
