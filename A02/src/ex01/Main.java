package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um Numero Inteiro: ");
        int a = sc.nextInt();
        System.out.println("Digite um numero flutuante: ");
        double b = sc.nextDouble();
        System.out.println("Digite uma String: ");
        String c = sc.next();
        System.out.println("Numero Inteiro é " + a);
        System.out.println("O Numero Flutuante é " + b);
        System.out.println("Sua String é " + c);


    }
}