package dio.exemplos.date.format;
import java.text.DateFormat;
import java.util.Date;

public class JavaDateFormat {
    public static void main(String[] args) {
        Date agora = new Date();
        
        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr);
        
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora); 
        System.out.println(dateToStr);
        
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora); 
        System.out.println(dateToStr);
    }
    
}
