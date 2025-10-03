package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;

        Filme f = new Filme();
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("1 - Cadastrar Produto \n 2 - Exibir Detalhes \n 3 - Avaliar Filme \n 4 -  Calcular Média das Avaliações \n 0 - Sair" );
            x = sc.nextInt();

            switch (x) {
                case 1:
                    f.cadstrarFilme();
                    break;

                case 2:
                    f.exibirDetalhes();
                    break;

                case 3:
                    System.out.println("Digite sua Nota: ");
                    f.avaliar(sc.nextInt());
                    break;

                case 4:
                    f.calcularMediaAvaliacoes();
            }
        } while (x != 0);


    }
}
