package dio.exemplos.local.date;

import java.time.LocalTime;

public class JavaLocalTime {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();
        System.out.println(agora);
        
        System.out.println("------------------------------");
        
        LocalTime agora2 = LocalTime.now();
        System.out.println(agora2);
        
        LocalTime maisHoras = agora2.plusHours(3);
        System.out.println(maisHoras);
        
    }
}
