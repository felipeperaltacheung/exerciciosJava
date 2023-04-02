package com.javaexercicios.lasagna;

public class Lasagna {


    public static void main(String[] args) {

        Lasagna lasagna = new Lasagna();

        lasagna.expectedMinutesInOven();


    }

    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int actualMinutesInOven){

        return expectedMinutesInOven() - actualMinutesInOven;

    }

    public int preparationTimeInMinutes(int numberOfLayers){

        return numberOfLayers * 2;

    }

    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven){

        return preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;

    }

}

//        1. Defina o tempo esperado de forno em minutos
//
//        2. Calcule o tempo restante do forno em minutos
//
//        3. Calcule o tempo de preparo em minutos
//
//        4. Calcule o tempo total de trabalho em minutos