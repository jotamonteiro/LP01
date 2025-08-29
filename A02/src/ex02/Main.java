package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = sc.next();

        System.out.println("digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("digite sua altura: ");
        double alt = sc.nextDouble();


        double imc = peso / (alt * alt);
        if (imc < 18.5) {
            System.out.println("Você está na categoria Baixo Peso, Procure um nutricionista Sr " + name);
        } else if (imc > 18.5 && imc < 24.99) {
            System.out.println("Você está na categoria Normal, Tá tudo bem Sr " + name);
        } else if (imc > 24.99 && imc < 29.99) {
            System.out.println("Você está na categoria Sobrepeso,Procure um nutricionista Sr " + name);
        } else {
            System.out.println("Você está na categoria Obesidade, Procure um nutricionista Sr " + name);
        }


        System.out.println("Seu IMC é de " + imc);
    }
}
