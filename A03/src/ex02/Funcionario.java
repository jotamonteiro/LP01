package ex02;

public class Funcionario {
    String mat;
    String nome;
    double salariob;
    double salarioLiq;
    double inss;

    public void calcularInss() {
        inss = salariob * 0.15;
    }
    public void calcularSalarioLiquido() {
        salarioLiq = salariob - inss;
    }
    public void contracheque() {
        System.out.println("Seu Nome: " + nome);
        System.out.println("Sua Matricula: " + mat);
        System.out.println("Seu Salario Bruto: " + salariob);
        System.out.println("Sua Dedução do INSS: " + inss);
        System.out.println("Seu Salario Liquido: " + salarioLiq);
    }
}
