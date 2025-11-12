package aula07;

public class Circulo extends FormaBidimensional {
    private final double PI = 3.14;
    public double raio;
    
    public Circulo(double raio) {
        super("Círculo");
        this.raio = raio;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * PI * raio;
    }
    
    @Override
    public double calcularArea() {
        return PI * raio * raio;
    }
}