package exercicio.java;
import java.util.Scanner;

/*
Escrever um algoritmo que lê:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */
public class Exercicio004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Codigo da peca 1 : ");
        String codPeca1 = input.nextLine();
        
        System.out.println("Valor da peca 1 : ");
        double valorPeca1 = input.nextDouble();
        
        System.out.println("Quantidade de pecas 1 : ");
        int qtdPeca1 = input.nextInt();
        
        
        
        System.out.println("Codigo da peca 2 : ");
        String codPeca2 = input.nextLine();
        System.out.println("-----------------------");
        
        System.out.println("Valor da peca 2 : ");
        double valorPeca2 = input.nextDouble();
        System.out.println("-----------------------");
        
        System.out.println("Quantidade de pecas 2 : ");
        int qtdPeca2 = input.nextInt();
        
        System.out.println("Valor do IPI: ");
        double ipi = input.nextDouble();
        
        System.out.println("Valor a ser pago: "+(valorPeca1*qtdPeca1 + valorPeca2 * qtdPeca2)*(ipi/100+1));
        
    }
}
