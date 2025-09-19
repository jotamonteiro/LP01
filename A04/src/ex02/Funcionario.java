package ex02;

public class Funcionario {
    private String nome;
    private double salario;
    private double hora;
    private int horat;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setHora(double hora){
        this.hora = hora;
    }

    public void setHorat(int horat) {
        this.horat = horat;
    }

    public double getHora() {
        return hora;
    }

    public int getHorat() {
        return horat;
    }

    public String getNome() {
        return nome;
    }

    public double calc_Salario() {
        salario = hora * horat;
        return salario;
    }



    public void contraCheque(){
        System.out.println("Seu Nome: " + getNome());
        System.out.printf("Você trabalhou %d horas, e o valor da hora é de R$%.2f.", getHorat(), getHora());
        System.out.println("\nSeu Salario: " + salario);
    }
}
