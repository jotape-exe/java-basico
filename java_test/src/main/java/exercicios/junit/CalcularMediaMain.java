package exercicios.junit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joao_
 */
public class CalcularMediaMain {
    
    
    public static void main(String[] args) {
        
        
        ArrayList<Aluno> turma = new ArrayList<>();
        

        Scanner inputNome = new Scanner(System.in);
        Scanner inputMatricula = new Scanner(System.in);
        Scanner inputMedia = new Scanner(System.in);
        Scanner inputCondicao = new Scanner(System.in);   
        
        //Metodo Main
        String condicao = "sim";
        
        
        
        do {
            Aluno a = new Aluno();
            //System.out.println(a.getClass().getSimpleName());
            //System.out.println(turma.getClass().getSimpleName());
            
            System.out.println("");
            
            System.out.println("Nome do aluno: ");
            a.setNome(inputNome.nextLine());
            
            System.out.println("Matricula do aluno: ");
            a.setMedia(inputMedia.nextFloat());
            
            System.out.println("Media do aluno: ");
            a.setMatricula(inputMatricula.nextInt());
            
            turma.add(a);
            System.out.println("Deseja adicionar outro aluno na turma ? (Digite sim ou SIM para continuar)");
            condicao = inputCondicao.nextLine();

        } while( "sim".equals(condicao) ||  "SIM".equals(condicao));
        
        //Calcula  a media
        int soma = 0;
        for (Aluno a: turma){
            System.out.println("Nome: " +a.getNome() + " media: " + a.getMedia());
            soma += a.getMedia();
        }
        int mediaAll = soma/turma.size();
        System.out.println("Media da turma: "+mediaAll);
        
        //Calcula o percentual
        int cont = 0;
        System.out.println("Alunos acima da media: ");
        for (Aluno a: turma){
            if (a.getMedia() > mediaAll){
                System.out.println(a.getNome()+" - media: "+a.getMedia());
                cont ++;
            }
        }
        System.out.println("percentual de alunos acima de media: "+ ((cont*100)/turma.size())+"%");
    }
}