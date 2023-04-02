package com.javaexercicios.loops;

public class LengthOfLastWord {

     static String s = "hello alabama";

     public static void main(String[] args) {
          System.out.println(lengthOfLastWord(s));
     }

     public static int lengthOfLastWord(String s){

          String[] words = s.trim().split("\\s+"); //trim para remover espaco em branco no inicio e no final da string
                                                         // split para dividir a stirng em palavras com base em espacos em branco
                                                         // \\s+ no metodo split e uma regex para um ou mais espaco em branco
                                                         // se o comprimento da matriz words for 0 significa que a string de entrada estava vazia ou com espaco em branco
                                                         // se nao, retorno o comprimento da ultima palavra na matriz words que e acessada usando o indice words.length -1
          if(words.length == 0) {
               return 0;
          } else  {
               return words[words.length -1].length();
          }


     }

}



//Example 1:
//
//        Input: s = "Hello World"
//        Output: 5
//        Explanation: The last word is "World" with length 5.
