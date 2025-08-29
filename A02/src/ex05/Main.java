package ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem Vindo ao Restaurante do Boa Vista Hotel");
        System.out.println("Para Escolher o Almoço, Digite 1. Para o Jantar, Digite 2");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("Seu Almoço será vai ser entregue em breve");
                break;

            case 2:
                System.out.println("Seu Jantar será entregue em breve");
                break;

            default:
                System.out.println("Opção Invalida");
        }
    }
}
