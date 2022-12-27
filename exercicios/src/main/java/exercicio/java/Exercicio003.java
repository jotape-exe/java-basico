package exercicio.java;
import java.util.Scanner;

/*
Informar um saldo e imprimir o saldo com reajuste de 1%.
 */
public class Exercicio003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu saldo: ");
        double saldo = input.nextDouble();
        
        double reajuste = saldo + (saldo*0.01);
        
        System.out.printf("Saldo com reajuste: %.2f",reajuste);
    }
}
