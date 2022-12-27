package pratica.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author joao_
 */
public class ServicoPessoaTest {
    
    public ServicoPessoaTest() {
    }
    
    private Pessoa adulto;
    private Pessoa notAdulto;
    private ServicoPessoa servicoPessoa;
    
    @BeforeEach

    public void setUp(){
        adulto = new Pessoa(18, "joao");
        notAdulto = new Pessoa(17, "joao");
        servicoPessoa = new ServicoPessoa();
    }

    @Test
    public void testIsAdultReturnTrueIfIdadeEqualOrGreater18() {
        
        Assertions.assertEquals(true, servicoPessoa.isAdult(adulto));
    }
    
    @Test
    public void testIsAdultReturnFalseIfIdadeLowerl18(){
        Assertions.assertEquals(false, servicoPessoa.isAdult(notAdulto));
    }

      @Test
        public void testIsAdultReturnFalseIfIdadeUpperl18(){
        Assertions.assertEquals(true, servicoPessoa.isAdult(adulto));
        } 
        
}
