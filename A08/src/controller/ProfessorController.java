package controller;

import model.Professor;
import service.ProfessorService;

import java.util.List;

public class ProfessorController {
    private ProfessorService pService = new ProfessorService();

    public void cadastrarProfessor(Professor p){
        pService.cadastrar(p);
    }

    public List<Professor> listarProfessores(){
        return pService.listar();
    }

}
