package ex03;

public class Aluno extends Pessoa{
    private int matricula;

    public Aluno(int matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public Aluno(String nome, String email, int matricula) {
        super(nome, email);
        this.matricula = matricula;
    }
}
