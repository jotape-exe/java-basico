package pratica.junit;

import java.util.Objects;

/**
 *
 * @author joao_
 */
public class ServicoPessoa {
    public boolean isAdult(Pessoa pessoa){
        Objects.requireNonNull(pessoa, "Pessoa não pode ser nulo!");
        return pessoa.getIdade() >= 18;
    }
}
