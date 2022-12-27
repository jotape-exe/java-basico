package dio.exemplos.packagecalendar;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;


//10 dias para pagar a fatura sem que os juros sejam cobrados
//caso a data caia num sabado ou domingo ele pode pagar na segunda
//Crie uma estrutura que receba uma data de vencimento e calcule quantos dias ele tem para pagar

public class javaCalendarExercicio {
    public static void main(String[] args) throws ParseException {

        Calendar data = Calendar.getInstance();
        SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        //Input que recebe a data
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a data (dia/mes/ano): ");
        String novaData = input.nextLine();
        System.out.println("-----------------------------------------");
        
        //Recebe a data e conta 10 dias ate o vencimento
        data.setTime(simpleFormat.parse(novaData));
        data.add(Calendar.DATE, 10);
        
        //Mostra a data de vencimento
        System.out.println("Data de vencimento: " + simpleFormat.format(data.getTime()));
        System.out.println("-----------------------------------------");
        
        //Mostra a data de vencimento após checagem
        data = checkFds(data);
        System.out.println("Voce deve pagar ate: " + simpleFormat.format(data.getTime()));  
        System.out.println("-----------------------------------------");
        
        
    }
    
    public static Calendar checkFds(Calendar data){
        //Checa de eh domingo
         if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            data.add(Calendar.DATE, 11);
            System.out.println("Eh domingo, mudando data para +11 dias");
            
        //Checa de eh sabado
         } else if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
            data.add(Calendar.DATE, 12);
            System.out.println("Eh sabado, mudando data para +12 dias");
            
       //Retorna a data sem ajustes
         } else {;
             System.out.println("Eh dia de semana, voce deve pagar normalmente");
         }
         
         System.out.println("-----------------------------------------");
        return data;
    } 
}
