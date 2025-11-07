package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Professor p = new Professor();
        Pessoa a = new Aluno();
        Disciplina d = new Disciplina();
        Coordenador c = new Coordenador();
        CadastroProfessor cp = new CadastroProfessor();

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
        ((Aluno) a).setMatricula(sc.nextLine());


        System.out.println("======== Cadastro do Professor =========");
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

        System.out.println("======= Cadastro da Disciplina =======");
        System.out.println("Digite o Nome da Disciplina: ");
        d.setNome(sc.nextLine());
        System.out.println("Digite a CH da Discilplina: ");
        d.setCh(sc.nextInt());
        sc.nextLine();

        System.out.println("======== Cadastro do Coordenador =========");
        System.out.println("Digite o Nome do Coordenador: ");
        c.setNome(sc.nextLine());
        System.out.println("Digite a Idade do Coordenador: ");
        c.setIdade(sc.nextInt());
        System.out.println("Digite o CPF do Coordenador: ");
        c.setCpf(sc.nextInt());
        sc.nextLine();

        p.setCargo(CARGO.Professor);
        c.setCargo(CARGO.Coordenador);

        d.associarProf(p);
        d.associarAluno((Aluno) a);

        System.out.println("=========");
        p.minhaResponsabilidade();
        p.quemSouEu();
        System.out.println(CARGO.Professor);

        System.out.println("=========");

        a.quemSouEu();
        a.minhaResponsabilidade();

        System.out.println("=========");

        System.out.println(a);
        System.out.println(p);
        System.out.println(c);
        System.out.println(d);

        cp.cadastrar(p);
        cp.listar();
    }
}
