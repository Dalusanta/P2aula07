package aula07;

public class Retangulo extends FormaBidimensional {
    public double largura;
    public double comprimento;
    
    public Retangulo(double largura, double comprimento) {
        super("Retangulo");
        this.largura = largura;
        this.comprimento = comprimento;
    }
    
    @Override
    public double calcularArea() {
        return largura * comprimento;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * (largura + comprimento);
    }
}