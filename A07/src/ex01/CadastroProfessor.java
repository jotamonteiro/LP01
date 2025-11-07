package ex01;

import java.util.ArrayList;

public class CadastroProfessor {
    private ArrayList<Professor> professores = new ArrayList<>();

    public void cadastrar(Professor p){
        professores.add(p);
        System.out.printf("Professor Cadastrado: %s", p.getNome());
    }

    public void listar(){
        for (Professor p : professores){
            System.out.println("Nome: " + p.getNome());
        }
    }
}
