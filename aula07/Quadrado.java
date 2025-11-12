package aula07;

public class Quadrado extends FormaBidimensional {
    public double lado;
    
    public Quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }
    
    @Override
    public double calcularPerimetro() {
        return lado*4;
    }
    
    @Override
    public double calcularArea() {
        return lado*lado;
    }
}