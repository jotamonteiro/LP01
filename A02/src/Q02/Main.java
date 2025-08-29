package Q02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua Matricula: ");
        int mat = sc.nextInt();
        System.out.println("Digite o Salario Bruto: ");
        double salario = sc.nextDouble();

        double inss = (salario * 0.15);
        double salLiq = salario - inss;

        System.out.println("Seu nome é " + nome);
        System.out.println("Sua matricula é " + mat);
        System.out.println("Seu salario é " + salario);
        System.out.println("O desconto do INSS é de " + inss);
        System.out.println("Seu Salario Liquido é de " + salLiq);

    }
}
