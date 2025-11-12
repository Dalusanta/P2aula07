package aula07;

public abstract class FormaGeometrica {
    public String nome;
    
    public FormaGeometrica(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public abstract double calcularArea();
}