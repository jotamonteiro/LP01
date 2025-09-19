package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();
        int x;

        do {
            System.out.println("1 - Cadastrar Produto \n 2 - Vender Produto \n 3 - Ver Estoque \n 0 - Sair" );
            x = sc.nextInt();

            switch (x) {
                case 1:
                    p.cadProduto();
                    break;

                case 2:
                    p.venProduto();
                    break;

                case 3:
                    p.verEstoque();
                    break;

            }
        } while (x != 0);





    }
}
