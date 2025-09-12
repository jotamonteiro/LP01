package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua Idade: ");
        p.idade = sc.nextInt();
        System.out.println("Idade Antiga:" + p.idade);
        p.niver();
        System.out.println("Idade Nova:" + p.idade);

    }
}