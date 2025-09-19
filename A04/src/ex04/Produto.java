package ex04;

import java.util.Scanner;

public class Produto {

    Scanner sc = new Scanner(System.in);

    private String cod, nome, cor;
    private double peso, valor;
    private int qtd;
    String response;
    int x;



    public void cadProduto(){
        do {
            System.out.println("Cod. do Produto: ");
            setCod(sc.next());
            sc.nextLine();
            System.out.println("Nome do Produto: ");
            setNome(sc.nextLine());
            System.out.println("Cor do Produto: ");
            setCor(sc.next());
            System.out.println("Valor do Produto: ");
            setValor(sc.nextDouble());
            System.out.println("Quantidade do Produto: ");
            setQtd(sc.nextInt());
            System.out.println("Peso do Produto: ");
            setPeso(sc.nextDouble());
            System.out.println("Quer cadastrar outro produto? Digite S");
            response = sc.next();

        }while (response.equalsIgnoreCase("S"));
    }

    public void venProduto(){

        System.out.println("Quantidade: ");
        int qntdTemp = sc.nextInt();


        if (qtd < qntdTemp) {
            System.out.println("Sem Estoque");

        } else {
            double total = qntdTemp * valor;
            System.out.println("Formas de Pagamento:");
            System.out.println("1 - Pix (5% desconto)");
            System.out.println("2 - Espécie (5% desconto)");
            System.out.println("3 - Transferência (5% desconto)");
            System.out.println("4 - Débito (5% desconto)");
            System.out.println("5 - Crédito (3x sem juros)");
            int formPay = sc.nextInt();

            switch (formPay){
                case 1:
                    total *= 0.95;
                    System.out.printf("Total com 5 por cento de desconto: R$ %.2f \n", total);
                    break;

                case 2:
                    System.out.print("Valor pago em espécie: R$ ");
                    double valorPago = sc.nextDouble();
                    if (valorPago > total) {
                        double troco = valorPago - total;
                        System.out.println("O troco é de R$ " + troco);
                        break;

                    } else {
                        System.out.println("Valor Induficiente");
                        break;
                    }
                case 4:
                    total *= 0.95;
                    System.out.printf("Total com 5 por cento de desconto: R$%.2f\n", total);

                case 5:
                    double parcela = total / 3;
                    System.out.printf("Total: R$%.2f em 3x de R$%.2f sem juros.\n", total, parcela);

            }
        }



    }

    public void verEstoque(){
        System.out.println("Código: " + cod);
        System.out.println("Nome: " + nome);
        System.out.println("Tamanho/Peso: " + peso);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: R$" + valor);
        System.out.println("Estoque: " + qtd);
    }




    public void setCod(String cod) {

        this.cod = cod;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setCor(String cor) {

        this.cor = cor;
    }

    public void setPeso(double peso) {

        this.peso = peso;
    }

    public void setValor(double valor) {

        this.valor = valor;
    }

    public void setQtd(int qtd) {

        this.qtd = qtd;
    }

    public String getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public double getPeso() {
        return peso;
    }

    public double getValor() {
        return valor;
    }

    public int getQtd() {
        return qtd;
    }


}
