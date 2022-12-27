package dio.exemplos.packagedate;
import java.util.Date;

public class JavaDateMethods {
    public static void main(String[] args) {
        Date dataPassado = new Date(1615395934243L);
        
        Date dataFuturo = new Date(1692464734234L);
        
        boolean isAfter = dataPassado.after(dataFuturo);
        
        System.out.println(dataPassado+" e depois de "+dataFuturo+ " : "+isAfter);
        
        boolean isBefore = dataPassado.before(dataFuturo);
        
        System.out.println(dataPassado+" e antes de "+dataFuturo+ " : "+isBefore);
    }
}
