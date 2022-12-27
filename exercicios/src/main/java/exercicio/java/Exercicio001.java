package exercicio.java;

import java.util.Scanner;

/* 
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e 
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/

public class Exercicio001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Sua idade em dias: ");
        int dia = input.nextInt();
        
        System.out.println("Sua idade em meses: ");
        int mes = input.nextInt();
        
        System.out.println("Sua idade em anos: ");
        int ano = input.nextInt();
        
        int total = (ano*365) + (mes*30) + dia;
        
        System.out.println(String.format("Voce possui %d dias de vida", total));
    }
    
}