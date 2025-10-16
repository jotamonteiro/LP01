package ex01;

public class Disciplina {
    private String nome;
    private int ch;
    private Professor p;
    private Aluno a;

    public Disciplina(String nome, int ch) {
        this.nome = nome;
        this.ch = ch;
    }

    public void associarProf(Professor p){
        this.p = p;
    }

    public void associarAluno(Aluno a){
        this.a = a;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }
}
