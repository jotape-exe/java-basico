package exercicio.java;
import java.util.Scanner;
/**
 *
 * @author joao_
 */

/*
Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)
*/

public class Exercicio005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        double salarioMinimo = 788.00;
        
        System.out.println("Digite seu salario: ");
        double salario = input.nextDouble();
        
        double quantidadeSalario = salario/salarioMinimo;
        System.out.printf("Voce recebe aproximadamente : %.2f salarios minimos", quantidadeSalario);
        
    }
}
