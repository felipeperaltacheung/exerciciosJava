package com.javaexercicios.loops;

public class Palindromo {


    public static void main(String[] args) {

        String name = "ana";
        StringBuilder sb = new StringBuilder(name);
        String reversedString = sb.reverse().toString();


        System.out.println(" A string ao contrario eh: " + reversedString);

        ehPalindromo(name, reversedString);

    }

    public static void ehPalindromo(String name, String reversedString) {
        if (reversedString.equals(name)) {
            System.out.println("eh palindromo");
        } else {
            System.out.println(" nao eh palindromo");
        }

    }

}
