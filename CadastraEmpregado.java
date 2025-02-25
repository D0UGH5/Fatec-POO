package Atividades;

import java.util.Scanner;

public class CadastraEmpregado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Salário: ");
        double salario = sc.nextDouble();
        Empregado empregado = new Empregado(nome, salario);

        System.out.println("Dados da empresa do empregado: ");
        System.out.print("Razão social: ");
        String razaoSocial = sc.nextLine();
        sc.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = sc.nextLine();
        System.out.print("Fone: ");
        String fone = sc.nextLine();
        Empresa empresa = new Empresa(razaoSocial, cnpj, fone);
        empregado.setEmpresa(empresa);

        System.out.println("Dados do empregado: ");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Salario: " + empregado.getSalario());
        System.out.println("Empresa: " + empregado.getEmpresa());
        sc.close();
    }
}
