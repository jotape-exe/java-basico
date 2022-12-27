package dio.exemplos.date.format;

import java.util.Date;
import java.text.SimpleDateFormat;

public class JavaSimpleDateFormatExercise {
    public static void main(String[] args) {
        Date agora = new Date();
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
        String dataFormatada = formatter.format(agora);
        
        System.out.println(dataFormatada);
        
        SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss:S");
        
        String novaDataFormatada = formatter2.format(agora);
        
        System.out.println(novaDataFormatada);
    }
}
