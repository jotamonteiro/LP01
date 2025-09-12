package ex04;

public class Produtos {
    String nome;
    double preco;
    int qnt;

    public void exibirDetalhes(){
        System.out.printf("Nome: %s", nome);
        System.out.printf("Preço: %f", preco);
        System.out.printf("Quantidade: %d", qnt);
    }
    public void calcularValorTotal(){
       double vt = preco * qnt;
        System.out.printf("Valor Total: %f", vt);
    }

}
