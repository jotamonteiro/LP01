package ex01;

public abstract class Pessoa {
    protected String nome;
    protected int cpf;
    protected int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract void quemSouEu();
    public abstract void minhaResponsabilidade();





    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", idade=" + idade +
                '}';
    }
}
