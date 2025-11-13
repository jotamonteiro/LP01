package service;

import model.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorService extends Professor {
    private ArrayList<Professor> professores = new ArrayList<>();

    public void cadastrar(Professor p){
        professores.add(p);
        System.out.printf("Professor Cadastrado: %s", p.getNome());
    }

    public List<Professor> listar(){
        for (Professor p : professores){
            System.out.println("Nome: " + p.getNome());
        }
        return null;
    }

    public void atualizarProfessor(String nome, String novoNome) {
        for (Professor professor : professores) {
            if (professor.getNome().equalsIgnoreCase(nome)) {
                professor.setNome(novoNome);
                System.out.println("Atualizado com sucesso!");
                return; }
        } System.out.println("Professor não foi encontrado."); }
}
