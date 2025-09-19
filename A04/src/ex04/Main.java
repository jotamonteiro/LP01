package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();

        System.out.println("Cod. do Produto: ");
        p.setCod(sc.next());
        System.out.println("Nome do Produto: ");
        p.setNome(sc.nextLine());
        System.out.println("Cor do Produto: ");
        p.setCor(sc.next());
        System.out.println("Valor do Produto: ");
        p.setValor(sc.nextDouble());
        System.out.println("Quantidade do Produto: ");
        p.setQtd(sc.nextInt());
        System.out.println("Peso do Produto: ");
        p.setPeso(sc.nextDouble());



    }
}
