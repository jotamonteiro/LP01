package ex02;

public class Aluno extends Pessoa{
    private int matricula;

    public Aluno(){

    }

    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public Aluno(String nome, int matricula, String email) {
        super(nome, email);
        this.matricula = matricula;
    }




    public int getMatricula() {
        return matricula;
    }


}
