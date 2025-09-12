package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produtos p = new Produtos();
        Scanner sc = new Scanner(System.in);

        String r;

        do {
            System.out.println("Digite 1: Cadastrar um Produto \n" + "Digite 2: Exibir Detalhes \n" + "Digite 3: Calcula o Valor Total do Estoque\n" + "Digite 4: Sair");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Digite o nome do Produto: ");
                    sc.nextLine();
                    System.out.println("Digite o Preço do Produto: ");
                    sc.nextDouble();
                    System.out.println("Digite a Quantidade do Produto em Estoque: ");
                    sc.nextInt();
                    System.out.println("Produto Cadastrado com Sucesso!!");
                    break;

                case 2:
                    p.exibirDetalhes();
                    break;

                case 3:
                    p.calcularValorTotal();
                    break;

                case 4:
                    
                    break;
            }

            System.out.println("Para ver o menu novamente Digite: S");
            r = sc.next();
        } while(r.equalsIgnoreCase("S"));

    }
}
