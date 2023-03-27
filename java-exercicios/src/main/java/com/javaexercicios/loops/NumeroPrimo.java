package com.javaexercicios.loops;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;

@Log4j2
public class NumeroPrimo {

    //2 ,3 ,5, 7, 11, 13,  17, 19,

    public static void main(String[] args) {

        int numero = 1;
        double raiz = Math.sqrt(numero);

        System.out.println(validaNumeroPrimo(numero, raiz));


        //System.out.println("os divisores sao: " + divisores);
        //List<Integer> divisores = obterDivisores(numero);

    }
//    private static List<Integer> obterDivisores(int numero) {
//        List<Integer> divisores = new ArrayList<>();
//        for(int i = 1; i <= numero; i++){
//            if(numero % i == 0){
//                divisores.add(i);
//            }
//        }
//        return divisores;
//    }

    private static boolean validaNumeroPrimo(int numero, double raiz) {

        if( numero <= 1){
            return false;
        }

        for(int i = 2; i < raiz; i++ ){
            if (numero % i == 0){
                return false;
            }
        }

        return true;
    }
}











//Divisibilidade por 2: todo número par (terminado em 0,2,4,6 e 8) são divisíveis por 2.
//Divisibilidade por 3: se a soma dos seus algoritmos der um número divisível por 3, este número é divisível por 3.
//Divisibilidade por 4: um número é divisível por 4 se ele for divisível duas vezes por 2 ou se os dois últimos algoritmos foram diviseis por 4.
//Divisibilidade por 5: todo número terminado em 0 e 5 é divisível por 5.
//Divisibilidade por 6: se o número for par e divisível por 3, o número também é divisível por 6.
//Divisibilidade por 7: um número é divisível por 7 se a diferença do dobro do último algoritmo e o restante do número for um número múltiplo de 7.;