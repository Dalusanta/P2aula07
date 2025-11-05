package aula06;

public class Gerente extends Funcionario {
    
    public Gerente(String nome, String cpf, double salario, String dataNascimento) {
        super(nome, cpf, salario, dataNascimento);
    }
    
    static public void criarGerente(String nome, String cpf, double salario, String dataNascimento) {
        Funcionario.arrayList.add(new Gerente(nome, cpf, salario, dataNascimento));
    }
    
    @Override
    public double getSalario() {
        return this.salario + 2000;
    }
}