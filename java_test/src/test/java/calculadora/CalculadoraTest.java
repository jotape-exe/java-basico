package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    
    public CalculadoraTest() {
    }


    @Test
    public void testSoma() {
        int x = 10;
        int y = 20;
        int esperado = 30;
        int obtido = x + y;
        
        assertEquals(esperado, obtido);
    }

    @Test
    public void testMultiplicacao() {
        int x = 10;
        int y = 10;
        int esperado = 200;
        int obtido = x * y;
        
        assertEquals(esperado, obtido);
    }

    @Test
    public void testDivisao() {
        int x = 20;
        int y = 20;
        int esperado = 1;
        int obtido = x / y;
        
        assertEquals(esperado, obtido);
    }

    @Test
    public void testSubtracao() {
        int x = 30;
        int y = 20;
        int esperado = 10;
        int obtido = x - y;
        
        assertEquals(esperado, obtido);
    }

    @Test
    public void testMain() {
        int x = 10;
        int y = 20;
        int esperado = 30;
        int obtido = x + y;
        
        assertEquals(esperado, obtido);
    }
    
}
