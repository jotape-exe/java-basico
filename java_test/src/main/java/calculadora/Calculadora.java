package calculadora;

public class Calculadora{
    double x;
    double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double Soma(double x, double y){
        return x + y;
    }
    
    public double Multiplicacao(double x, double y){
        return x * y;
    }
    
    public double Divisao(double x, double y){
        return x / y;
    }
    
    public double Subtracao(double x, double y){
        return x - y;
    }
    
    public static void main(String[] args) {
        //Calculadora calculator = new Calculadora();
        
       
    }
}
