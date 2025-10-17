package ex01;

public class Disciplina {
    private String nome;
    private int ch;
    private Professor p;
    private Aluno a;

    public Disciplina() {

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

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", ch=" + ch +
                ", p=" + p +
                ", a=" + a +
                '}';
    }
}
