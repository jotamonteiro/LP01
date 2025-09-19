package ex03;

public class Pessoa {
    private double peso, altura, imc;

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void showIMC(){
        imc = peso / (altura * altura);
        System.out.println("Seu Imc é: ");
    }
}
