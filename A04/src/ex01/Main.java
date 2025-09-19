package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Digite seu Nome: ");
        p.setNome(sc.next());
        System.out.println("Digite sua Idade: ");
        p.setIdade(sc.nextInt());
        System.out.println("Digite seu CPF: ");
        p.setCpf(sc.next());

        System.out.println("Seu Nome: " + p.getNome());
        System.out.println("Sua Idade: " + p.getIdade());
        System.out.println("Seu CPF: " + p.getCpf());
    }
}
