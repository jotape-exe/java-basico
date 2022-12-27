package exercicio.interfac.core;

/**
 *
 * @author joao_
 */
public class Eletronico {
    private int watts;
    private String placaCircuito;
    private String material;
    private boolean statusLigado;

    public boolean isStatusLigado() {
        return statusLigado;
    }

    public void setStatusLigado(boolean statusLigado) {
        this.statusLigado = statusLigado;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    public String getPlacaCircuito() {
        return placaCircuito;
    }

    public void setPlacaCircuito(String placaCircuito) {
        this.placaCircuito = placaCircuito;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
}
