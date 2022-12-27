package dio.exemplos.packagedate;
import java.util.Date;

public class javaDateTimeMillis {
    public static void main(String[] args) {
        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Epoch - "+currentTimeMillis);
        
        System.out.println("                             ");
        
        Date novaData = new Date(currentTimeMillis);
        System.out.println(novaData);
    }
}
