package aula07;

public class Cubo extends FormaTridimensional {
    public double lado;
    
    public Cubo(double lado) {
        super("Cubo");
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado * 6;
    }
    
    @Override
    public double calcularVolume() {
        return lado * lado * lado;
    }
}