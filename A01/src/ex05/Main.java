package ex05;

public class Main {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 8;
        int n3 = 5;
        int media;
        int notaF;

        media = (n1 + n2 + n3) / 3;
        notaF = media - 7;

        if (media >= 7) {
            System.out.printf("Aluno aprovado com a Media %d", media);
        } else {
            System.out.printf("Aluno reprovado precisando de %d", notaF);
        }

    }
}
