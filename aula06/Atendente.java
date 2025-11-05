package aula06;

public class Atendente extends Funcionario {
    double comissao;
    
    public Atendente(String nome, String cpf, double salario, String dataNascimento, double comissao) {
        super(nome, cpf, salario, dataNascimento);
        this.comissao = comissao;
    }
    
    static public void criarAtendente(String nome, String cpf, double salario, String dataNascimento, double comissao) {
        Funcionario.arrayList.add(new Atendente(nome, cpf, salario, dataNascimento, comissao));
    }
}