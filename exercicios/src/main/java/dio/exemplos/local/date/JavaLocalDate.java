package dio.exemplos.local.date;

import java.time.LocalDate;

public class JavaLocalDate {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        
        System.out.println(hoje);
        
        System.out.println("----------------------------");
        
        LocalDate diaHoje = LocalDate.now();
        
        LocalDate diaOntem = diaHoje.minusDays(1);
        
        System.out.println(diaHoje);
        System.out.println(diaOntem);
    }
}
