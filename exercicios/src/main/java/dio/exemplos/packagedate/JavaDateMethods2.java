package dio.exemplos.packagedate;
import java.util.Date;

public class JavaDateMethods2 {
    public static void main(String[] args) {
        Date dataPassado = new Date(1611335134L);
        Date dataFuturo = new Date(1684429534L);
        Date mesmaDataFuturo = new Date(1684429534L);
        
        boolean isEquals = dataFuturo.equals(mesmaDataFuturo);
        //Compara a Diferentes objetos com mesmo conteudo
        System.out.println(isEquals);
        
        int case1 = dataPassado.compareTo(dataFuturo);
        
        int case2 = dataFuturo.compareTo(dataPassado);
        
        int case3 = dataFuturo.compareTo(mesmaDataFuturo);
        
        System.out.println(case1); //-1 "Passado"
        
        System.out.println(case2);// 1 "Futuro"
        
        System.out.println(case3);// 0 "Equivalente"
    }
}
