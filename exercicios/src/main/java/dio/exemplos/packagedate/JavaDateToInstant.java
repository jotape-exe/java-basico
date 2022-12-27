package dio.exemplos.packagedate;
import java.util.Date;
import java.time.Instant;

public class JavaDateToInstant {
    
    public static void main(String[] args) {
        Date dataInicio = new Date(1643907373000L);
        
        System.out.println(dataInicio);
        
        Instant instante = dataInicio.toInstant();
        System.out.println(instante);
    }  
}
