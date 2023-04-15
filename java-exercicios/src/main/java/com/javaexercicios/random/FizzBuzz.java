package com.javaexercicios.random;

import java.util.ArrayList;

public class FizzBuzz {

    public static void main(String[] args) {

    for(int i = 1; i <= 100; i++){
        if ( i % 3 == 0 && i % 5 == 0){
            System.out.println("FIZZBUZZ");
        } else if (i % 3 == 0){
            System.out.println("FIZZ");
        } else if ( i % 5 == 0){
            System.out.println("BUZZ");
        } else System.out.println(i);
    }

    }
}

// Os multiplos de um numero sao obtidos multiplicando o numero por um fator. Este fator
// por sua vez e tb divisor do multiplo encontrado

//    Write a short program that prints each number from 1 to 100 on a new line.
//
//        For each multiple of 3, print "Fizz" instead of the number.
//
//        For each multiple of 5, print "Buzz" instead of the number.
//
//        For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number