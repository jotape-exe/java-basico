package dio.exemplos.date.format;

import java.util.Date;
import java.text.SimpleDateFormat;

public class JavaSimpleDateFormat {
    public static void main(String[] args) {
        Date agora = new Date();
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
        String dataFormatada = formatter.format(agora);
        
        System.out.println(dataFormatada);
    }
}
