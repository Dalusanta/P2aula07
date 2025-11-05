package aula06;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        //ArrayList<Funcionario> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        //arrayList.add(new Gerente("a","b",1000,"c"));
        
        
        boolean verdade = true;
        
        System.out.println("Menu:");
        
        while(verdade) {
            System.out.printf("(0) - Adicionar gerente\n(1) - Adicionar atendente\n(2) - Listar todos os funcionários\n(3) - Mostrar salário de funcionário (o usuário deve informar o CPF do funcionário)\n(5) - Sair");
            System.out.println("");
            String escolha = scanner.nextLine();
            
            String nome;
            String cpf;
            double salario;
            String dataNascimento;
            double comissao;
            
            switch(escolha) {
                case "0":
                System.out.println("Adicionar gerente: ");
                System.out.print("Nome: ");
                nome = scanner.nextLine();
                System.out.print("CPF: ");
                cpf = scanner.nextLine();
                System.out.print("Salário: ");
                salario = Double.parseDouble(scanner.nextLine());
                System.out.print("Data de nascimento: ");
                dataNascimento = scanner.nextLine();
                Gerente.criarGerente(nome, cpf, salario, dataNascimento);
                break;
                case "1":
                System.out.println("Adicionar atendente: ");
                System.out.print("Nome: ");
                nome = scanner.nextLine();
                System.out.print("CPF: ");
                cpf = scanner.nextLine();
                System.out.print("Salário: ");
                salario = Double.parseDouble(scanner.nextLine());
                System.out.print("Data de nascimento: ");
                dataNascimento = scanner.nextLine();
                System.out.print("Comissão: ");
                comissao = Double.parseDouble(scanner.nextLine());
                Atendente.criarAtendente(nome, cpf, salario, dataNascimento, comissao);
                break;
                case "2":
                Funcionario.listar();
                break;
                case "3":
                System.out.print("Informe o CPF: ");
                cpf = scanner.nextLine();
                System.out.println("O salário do funcionário é "+ Funcionario.buscarSalario(cpf));
                break;
                case "4":
                verdade = false;
                break;
                default:
                System.out.println("Nada foi selecionado");
            }
        }
        
        
    }
}