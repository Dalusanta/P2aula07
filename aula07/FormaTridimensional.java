package aula07;

public abstract class FormaTridimensional extends FormaGeometrica {
    public FormaTridimensional(String nome) {
        super(nome);
    }
    
    public abstract double calcularVolume();
}