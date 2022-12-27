package calculadoramedias.service;
import calculadoramedias.main.Aluno;
import java.text.DecimalFormat;

/**
 *
 * @author joao_
 */
public class CalculadoraMedias {
    public String gerarMediasTurma(Aluno[] turma){
        float media = 0;
        
        for( Aluno aluno : turma){
            media += aluno.getMedia();
        }
        
        return new DecimalFormat("#.##").format(media);
    }
    
    public String retornarPercentualAcimaMedia(Aluno[] turma){
        String media = gerarMediasTurma(turma);
        media = media.replace(',', '.');
        int qtdeAcimaMedia = 0;
        
        for (Aluno aluno : turma){
            if (aluno.getMedia() > Float.valueOf(media)){
                qtdeAcimaMedia ++;
            }
        }
        qtdeAcimaMedia = (qtdeAcimaMedia * 100) / turma.length;
        return new DecimalFormat("#.##").format(qtdeAcimaMedia);
    }
}
