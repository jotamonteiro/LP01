package ex03;

public class ContaBancaria {
    String nConta;
    String titular;
    double saldo = 0;

    public void consultarSaldo() {
        System.out.println("Seu Saldo é " + saldo);
    }
    public void depositar(double valor) {
        saldo = saldo + valor;

    }
    public void sacar(double valor) {
        if (saldo < 0 ){
            System.out.println("Você não tem saldo");
        } else {
            saldo = saldo - valor;
        }
    }
    public void transferir(String destino, double valor){
        if (saldo < 0 ){
            System.out.println("Você não tem saldo");
        } else {
            saldo = saldo - valor;
            System.out.printf("Sua Transferencia para %s de %f, foi um sucesso!", destino, valor);
        }
    }
}