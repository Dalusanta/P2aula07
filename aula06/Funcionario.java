package aula06;

import java.util.ArrayList;

public class Funcionario {
    String nome;
    String cpf;
    double salario;
    String dataNascimento;
    
    static ArrayList<Funcionario> arrayList = new ArrayList<>();
    
    public Funcionario(String nome, String cpf, double salario, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getCPF() {
        return this.cpf;
    }
    
    static double buscarSalario(String cpf) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (cpf.equals(arrayList.get(i).getCPF())) {
                return arrayList.get(i).getSalario();
            }
        }
        return -1;
    }
    
    static public void listar() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i+". "+arrayList.get(i).getNome());
        }
    }
}