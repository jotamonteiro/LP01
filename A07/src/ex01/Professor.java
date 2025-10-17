package ex01;

public class Professor extends Pessoa{
    public CARGO cargo;
    private int matricula;
    private String disciplina;


    public void setCargo(CARGO cargo) {
        this.cargo = cargo;
    }

    public CARGO getCargo() {
        return cargo;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }



    @Override
    public void quemSouEu() {
        System.out.println("Sou o Professor!!");
    }

    @Override
    public void minhaResponsabilidade() {
        System.out.println("Tenho que ensinar Java");
    }


    @Override
    public String toString() {
        return "Professor{" +
                "cargo=" + cargo +
                ", matricula=" + matricula +
                ", disciplina='" + disciplina + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", idade=" + idade +
                '}';
    }
}
