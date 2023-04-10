package com.javaexercicios.controlflow;

import java.util.Random;

public class GuessIt {

    public static void main(String[] args) {

        int randomNum = new Random().nextInt(3) + 1;

        System.out.printf("Generated number is: %d.%n", randomNum);

        if(randomNum == 1){
            System.out.println("RED");;
        } else if (randomNum == 2) {
            System.out.println("BLUE");
        } else  {
            System.out.println("BLACK");
        }
    }


}

// range 1 to 3
//    Generate a number and store it in a variable and the number needs to be one, two, or three
