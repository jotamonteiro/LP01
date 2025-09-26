package ex02;

public class Pessoa {
    protected String nome;
    protected String email;

    public Pessoa(){

    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }


    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
