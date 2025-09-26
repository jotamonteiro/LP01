package ex01;

public class Professor extends Pessoa {
    private String matricula;
    private double salario;
    private int horat;
    private double valorh;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setHorat(int horat) {
        this.horat = horat;
    }

    public void setValorh(double valorh) {
        this.valorh = valorh;
    }

    public void calcularSalario(){
        this.salario = valorh * horat;
    }

    public void showCadastrado(){
        System.out.printf("ex01.Professor: %s", nome);
        System.out.printf("\nIdade do ex01.Professor: %d", idade);
        System.out.printf("\nSalario: %f", salario);
        System.out.printf("\nMatricula do ex01.Professor: %s", matricula);
    }

}
