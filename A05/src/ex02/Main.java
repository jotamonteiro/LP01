package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Aluno a = new Aluno("Joao", 1234);
        Aluno a2 =  new Aluno("Ana", 888, "teste9080@email.com");
        Aluno a3 = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println(a.getMatricula());
        System.out.println(a.getNome());

        System.out.println(a2.getMatricula());
        System.out.println(a2.getNome());
        System.out.println(a2.getEmail());
    }
}
