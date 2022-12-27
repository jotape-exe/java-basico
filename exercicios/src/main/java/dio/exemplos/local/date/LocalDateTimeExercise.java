package dio.exemplos.local.date;


import java.time.LocalDateTime;

public class LocalDateTimeExercise {
    public static void main(String[] args) {
        LocalDateTime passado = LocalDateTime.of(2010, 05, 15, 10, 00, 00);
        System.out.println("Passado ---> "+passado);

        LocalDateTime futuro = passado.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println("Futuro ---> "+futuro);
    }
}
