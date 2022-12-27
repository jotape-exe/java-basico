package exercicio.java;

/*
Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos 
números 4, 5 e 6. A soma das duas médias. A média das médias.
 */

public class Exercicio002 {
    public static void main(String[] args) {
        double media1 = 8+9+7;
        double media2 = 4+5+6;
        
        double mediaSum = media1+media2;
        
        double mediaDasMedias = mediaSum/2;
        
        System.out.println("Media1 --> "+media1);
        System.out.println("Media2 --> "+media2);
        System.out.println("Sum (Media1, Media2) --> "+mediaSum);
        System.out.println("Media (Media1, Media2)/2 --> "+mediaDasMedias);
    }
}
