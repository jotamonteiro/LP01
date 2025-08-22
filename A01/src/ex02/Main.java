package ex02;

public class Main {
    public static void main(String[] args) {

        int qntEmHoras = 40;
        double valorHora = 15.00;
        double salario;
        String mensagem;

        salario = qntEmHoras * valorHora;
        mensagem = String.format("O salario dele é igual a %f" , salario);

        System.out.println(mensagem);
    }
}
