package Q01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite seu Nome: ");
            String nome = sc.next();
            System.out.println("Digite sua Idade: ");
            int idade = sc.nextInt();
            System.out.printf("Seu nome é %s e sua idade é %d, ", nome, idade);

            System.out.println("Você quer fazer outro cadastro? Digite S/N");
            resp = sc.next();

        }
        while (resp.equalsIgnoreCase("S"));
    }
}
