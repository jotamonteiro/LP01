package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.println("Digite seu Nome: ");
        f.nome = sc.next();
        System.out.println("Digite sua Matricula: ");
        f.mat = sc.next();
        System.out.println("Digite seu Salario Bruto: ");
        f.salariob = sc.nextDouble();

        f.calcularInss();
        f.calcularSalarioLiquido();
        f.contracheque();


    }
}
