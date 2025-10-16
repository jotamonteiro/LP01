package ex01;

public class Professor extends Pessoa{
    private int matricula;
    private String disciplina;

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }


    @Override
    public String toString() {
        return "Professor{" +
                "matricula=" + matricula +
                ", disciplina='" + disciplina + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", idade=" + idade +
                '}';
    }
}
