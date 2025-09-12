package ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String r;

        ContaBancaria cb = new ContaBancaria();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Numero da Conta: ");
        cb.nConta = sc.next();
        sc.nextLine();
        System.out.println("Digite o Nome do Titular da Conta: ");
        cb.titular = sc.nextLine();

        do {
            System.out.println("Digite 1: Consultar Saldo \n" + "Digite 2: Depositar \n" + "Digite 3: Transferir\n" + "Digite 4: Sacar");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    cb.consultarSaldo();
                    break;

                case 2:
                    System.out.println("Digite o valor do Deposito: ");
                    cb.depositar(sc.nextDouble());
                    break;

                case 3:
                    System.out.println("Digite o destinatario da transferência: ");
                    String d = sc.next();
                    System.out.println("Digite o valor da Transferência: ");
                    double v = sc.nextDouble();
                    cb.transferir(d,v);
                    break;

                case 4:
                    System.out.println("Digite o Valor do saque: ");
                    cb.sacar(sc.nextDouble());
                    break;
            }

            System.out.println("Para ver o menu novamente Digite: S");
            r = sc.next();
        } while(r.equalsIgnoreCase("S"));

    }
}
