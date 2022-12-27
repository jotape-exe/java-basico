package dio.exemplos.packagecalendar;
import java.util.Calendar;


public class JavaCalendar {
    public static void main(String[] args) {
        Calendar atual = Calendar.getInstance();
        
        System.out.println("A data atual e: "+atual.getTime());
        
        atual.add(Calendar.DATE, -15);
        System.out.println("Data de 15 dias atras: "+atual.getTime());
        
        atual.add(Calendar.MONTH, 4);
        System.out.println("Data de 4 meses depois: "+atual.getTime());
        
        atual.add(Calendar.YEAR, 2);
        System.out.println("Data de dois anos depois: "+atual.getTime());
    }
}
