package ex01;

import java.util.Scanner;

public class Filme {
    private String nome, genero, response;
    private int ano,qtdAvaliacoes ;
    private double duracao, somaNotas, media;

    Scanner sc = new Scanner(System.in);

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de Lançamento: " + ano);
        System.out.println("Duração em Minutos: " + duracao);
    }

    public void avaliar(int nota){
        somaNotas += nota;
        qtdAvaliacoes += 1;
    }

    public void calcularMediaAvaliacoes(){
        media = somaNotas / qtdAvaliacoes;
        System.out.println(media);
    }

    public void cadstrarFilme(){
     do {
         System.out.println("Digite o nome do filme: ");
         setNome(sc.nextLine());
         System.out.println("Digite o Gênero do filme: ");
         setGenero(sc.nextLine());
         System.out.println("Digite o Ano de Lançamento do Filme: ");
         setAno(sc.nextInt());
         System.out.println("Digite a duração do Filme em Minutos: ");
         setDuracao(sc.nextDouble());
         System.out.println("Quer cadastrar outro produto? Digite S");
         response = sc.next();

    }while (response.equalsIgnoreCase("S"));
}
}
