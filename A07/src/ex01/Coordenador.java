package ex01;

public class Coordenador extends Pessoa implements Remunerado{
    private double salario;
    private CARGO cargo;

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    public void setCargo(CARGO cargo){
        this.cargo = cargo;
    }

    @Override
    public void setCpf(int cpf) {
        super.setCpf(cpf);
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public void quemSouEu() {
        System.out.println("Eu sou o Coordenador do Curso!");
    }

    @Override
    public void minhaResponsabilidade() {
        System.out.println("Sou responsavel por gerenciar e administrar o curso");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void aplicarBonus() {
        double bonusSalario = salario + (salario * 0.10);
        System.out.println("Salario + o Bonus foi de " + bonusSalario);
    }

    @Override
    public void calcularSalario() {

    }
}
