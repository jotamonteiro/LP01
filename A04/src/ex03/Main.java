package ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Digite seu peso: ");
        p.setPeso(sc.nextDouble());
        System.out.println("Digite sua altura:");
        p.setAltura(sc.nextDouble());

        System.out.println("Seu Peso é de " + p.getPeso());
        System.out.println("Sua Altura é de " + p.getAltura());
        p.showIMC();
    }
}
