package ex01;

public class Aluno extends Pessoa{
    private String matricula;
    private double nota1, nota2, nota3;

// Media pode ser assim jaq ela n vai ser usada
    // nao to usndo os gets por conta do mostrar cadastrado

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }


    public String getMatricula() {
        return matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double calcularMedia(){
        return (nota1 + nota2 + nota3) / 3;
    }

    public void showCadastrado(){
        System.out.printf("ex01.Aluno: %s", nome);
        System.out.printf("\nIdade do ex01.Aluno: %d", idade);
        System.out.printf("\nNotas do ex01.Aluno: %f, %f, %f", nota1, nota2, nota3);
        System.out.printf("\nMedia do ex01.Aluno: %f", calcularMedia());
        System.out.printf("\nMatricula do ex01.Aluno: %s", matricula);
    }
}
