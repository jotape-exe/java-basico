package pratica.junit;

/**
 *
 * @author joao_
 */
public class Pessoa {
    private int idade;
    private String nome;
    
    
    public Pessoa(int idade, String nome){
        this.setNome(nome);
        this.setIdade(idade);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
