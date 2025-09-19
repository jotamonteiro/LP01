package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.println("Digite seu Nome: ");
        f.setNome(sc.nextLine());
        System.out.println("Digite o Valor da Hora: ");
        f.setHora(sc.nextDouble());
        System.out.println("Digite sua Quantidade de Horas Trabalhadas: ");
        f.setHorat(sc.nextInt());

        f.calc_Salario();
        f.contraCheque();
    }
}
