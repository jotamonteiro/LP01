package ex04;

public class Produtos {
    String nome;
    double preco;
    int qnt;

    public void exibirDetalhes(){
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Preço: %f\n", preco);
        System.out.printf("Quantidade: %d\n", qnt);
    }
    public void calcularValorTotal(){
       double vt = preco * qnt;
        System.out.printf("Valor Total: %.2f\n", vt);
    }

}
