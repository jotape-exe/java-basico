package exemplos;
import java.util.Date;
import java.time.LocalDate;


public class Exemplo002 {
    public static void main(String[] args) {
        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        
        System.out.println("-----------------------");
        
        Date newDate = new Date();
        System.out.println(newDate);
        
        System.out.println("-----------------------");
        
        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual);
        
        System.out.println("-----------------------");
        
        Date myDate = new Date(1045018800000L);
        System.out.println(myDate);
        
        System.out.println("-----------------------");
        
        Date otherDate = new Date(1273892400000L);
        
        boolean isAfter = myDate.after(otherDate);
        System.out.println("Nasci depois de 15 de maio de 2010 // "+isAfter);
        
        System.out.println("-----------------------");
        
        boolean isBefore = myDate.before(otherDate);
        System.out.println("Nasci antes de 15 de maio de 2010 // "+isBefore);
    }
}
