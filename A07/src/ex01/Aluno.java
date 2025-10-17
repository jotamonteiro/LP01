package ex01;

public class Aluno extends Pessoa{
    private String matricula;


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void quemSouEu() {
        System.out.println("Eu Sou o Aluno");
    }

    @Override
    public void minhaResponsabilidade() {
        System.out.println("Tenho que Aprender");
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", idade=" + idade +
                '}';
    }
}
