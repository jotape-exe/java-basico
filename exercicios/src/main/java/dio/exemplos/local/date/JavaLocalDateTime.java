package dio.exemplos.local.date;
import java.time.LocalDateTime;

public class JavaLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
                
        System.out.println(agora);
        
        LocalDateTime futuro = agora.plusHours(6).plusDays(3).plusSeconds(190);
        
        System.out.println(futuro);
    }
}
