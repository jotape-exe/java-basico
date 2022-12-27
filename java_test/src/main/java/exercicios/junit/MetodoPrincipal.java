/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.junit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author joao_
 */
public class MetodoPrincipal {
    public static void main(String[] args) {
        
        //System.out.println(CalculadoraMedias.gerarMediaTurma(turma));
        
        
        Scanner inputNome = new Scanner(System.in);
        Scanner inputMatricula = new Scanner(System.in);
        Scanner inputMedia = new Scanner(System.in);
        Scanner inputCondicao = new Scanner(System.in);
        
        List<Aluno> turma;
        turma = new ArrayList<>();
         //Metodo Main
        String condicao = "sim";
        
        do {
            Aluno a = new Aluno();
            
            System.out.println("Nome do aluno: ");
            a.setNome(inputNome.nextLine());
            
            System.out.println("Media do aluno: ");
            a.setMedia(inputMedia.nextFloat());
            
            System.out.println("Matricula do aluno: ");
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
