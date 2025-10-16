package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Professor p = new Professor();
        Aluno a = new Aluno();

        System.out.println("====== Cadastro de Aluno =======");
        System.out.println("Digite o Nome do Aluno: ");
        a.setNome(sc.nextLine());
        System.out.println("Digite CPF do Aluno: ");
        a.setCpf(sc.nextInt());
        sc.nextLine();
        System.out.println("Digite a Idade do aluno: ");
        a.setIdade(sc.nextInt());
        sc.nextLine();
        System.out.println("Digite a Matricula do Aluno: ");
        a.setMatricula(sc.nextLine());



        System.out.println("Digite o Nome do Professor: ");
        p.setNome(sc.nextLine());
        System.out.println("Digite a Idade do Professor: ");
        p.setIdade(sc.nextInt());
        System.out.println("Digite o CPF do Professor: ");
        p.setCpf(sc.nextInt());
        sc.nextLine();
        System.out.println("Digite a Matricula do Professor: ");
        p.setMatricula(sc.nextInt());
        sc.nextLine();





        System.out.println(a);
        System.out.println(p);
    }
}
