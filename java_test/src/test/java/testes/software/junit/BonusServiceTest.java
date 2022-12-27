package testes.software.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author joao_
 */
public class BonusServiceTest {
    
    public BonusServiceTest() {
    }
    
    
    @Test
    public void testAplicarBonus(Funcionario f) {
        f.setSalario(1500);
    }
    
}
