package dio.exemplos.packagedate;
import java.util.Date;

public class JavaDateExercicio {
    public static void main(String[] args) {
        Date nascimento = new Date(1045105200000L);
        Date compare = new Date(1273892400000L);
        
        boolean isBefore = compare.before(nascimento);
        boolean isAfter = compare.after(nascimento);
        
        System.out.println("O data: "+compare+" e anterior a data: "+nascimento+" ----> "+isBefore);
        System.out.println("O data: "+compare+" e posterior a data: "+nascimento+" ----> "+isAfter);
    }
}
