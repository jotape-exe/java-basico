package exercicio.java;
import java.util.Scanner;

/**
 *
 * @author joao_
 */

/*
Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.
*/
public class Exercicio006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite um numero: ");
        int num = input.nextInt();
        
        System.out.println("Seu antecessor: "+ (num-1));
        System.out.println("Seu sucessor: "+ (num+1));
    }
}
