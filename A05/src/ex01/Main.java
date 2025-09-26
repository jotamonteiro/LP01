package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor p = new Professor();
        Aluno a = new Aluno();
        Scanner sc = new Scanner(System.in);
        int count = 0;



        System.out.println("Digite o Nome do ex01.Aluno: ");
        a.setNome(sc.nextLine());
        System.out.println("Digite a Idade do aluno: ");
        a.setIdade(sc.nextInt());
        sc.nextLine();
        System.out.println("Digite a Matricula do ex01.Aluno");
        a.setMatricula(sc.next());
        System.out.println("Digite A Primeira Nota: ");
        a.setNota1(sc.nextDouble());
        System.out.println("Digite A Segunda Nota: ");
        a.setNota2(sc.nextDouble());
        System.out.println("Digite A Terceira Nota: ");
        a.setNota3(sc.nextDouble());
        a.calcularMedia();

        System.out.println("Digite o Nome do ex01.Professor: ");
        p.setNome(sc.nextLine());
        System.out.println("Digite a Idade do ex01.Professor: ");
        p.setIdade(sc.nextInt());
        sc.nextLine();
        System.out.println("Digite a Matricula do ex01.Professor: ");
        p.setMatricula(sc.next());
        System.out.println("Digite as Horas Trabalhadas do ex01.Professor: ");
        p.setHorat(sc.nextInt());
        System.out.println("Digite o Valor da Hora Trabalhada; ");
        p.setValorh(sc.nextDouble());
        p.calcularSalario();
        p.showCadastrado();
        a.showCadastrado();



        }
}