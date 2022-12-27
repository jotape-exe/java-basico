package testes.software.junit;

/**
 *
 * @author joao_
 */
public class BonusService{
    public double aplicarBonus(Funcionario f){
        f.setNome("Joao");
        f.setCpf("000.000.000-00");
        f.setSalario(1800);
        
        if (f.getSalario() < 1500){
            return f.getSalario() * 0.1;
        }
        return f.getSalario() * 0.07;
    }
}
