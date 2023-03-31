package com.javaexercicios.loops;

public class ParMaiorQue10 {

    //numero par maior que 10

    public static void main(String[] args) {

    int[] numeros = {5, 12, 7, 15, 16, 4, 8, 20, 27, 28};


        for(int num : numeros){

            if(num % 2 == 0 && num > 10){
                System.out.println(num);
        }
    }


    }
}
