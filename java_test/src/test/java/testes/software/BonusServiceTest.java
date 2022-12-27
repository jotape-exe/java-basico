package testes.software;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest{
    double salario = 1500;
    
    //private Funcionario funcionario;
    
    public BonusServiceTest() {
    }

    @Test
    public void testAplicarBonus() {
        if (salario <= 1500) {
            this.salario += this.salario * 0.1;
        }
        else{
             this.salario += this.salario * 0.07;
        }
    }  
}
