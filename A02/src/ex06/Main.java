package ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resp;

        do {
            System.out.println("1: Macaxeira  2: Arroz e Feijão  3: Lasanha");
            int v = sc.nextInt();
            switch (v) {
                case 1:
                    System.out.println("Sua Macaxeira vai ser servida");
                    break;
                case 2:
                    System.out.println("Seu Arroz e Feijão vai ser servido");
                    break;
                case 3:
                    System.out.println("Sua Lasanha vai ser servida");
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
            System.out.println("Para Pedir Novamente Digite S");
            resp = sc.next();
        } while (resp.equalsIgnoreCase("S"));

    }
}
