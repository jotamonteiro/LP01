package ex04;

public class Main {
    public static void main(String[] args) {
        String palavra1 = "genio";
        String palavraChave = "gênio";

        if (palavra1.equalsIgnoreCase(palavraChave)) {
            System.out.println("é igual");
        } else {
            System.out.println("São Diferentes");
        }
    }
}
