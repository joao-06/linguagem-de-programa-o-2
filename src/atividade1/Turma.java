/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
class Turma {
    private String identificacao;
    private List<Professor> professores;
    private List<Estudante> estudantes;

    
    public Turma(String identificacao) {
        this.identificacao = identificacao;
        this.professores = new ArrayList<>();
        this.estudantes = new ArrayList<>();
    }

    public Turma() {  this.professores = new ArrayList<>();
        this.estudantes = new ArrayList<>();}


    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public void listarProfessores() {
        System.out.println("Professores na turma " + identificacao + ":");
        for (Professor professor : professores) {
            professor.mostrarDadosProfessor();
        }
    }

    public void listarEstudantes() {
        System.out.println("Estudantes na turma " + identificacao + ":");
        for (Estudante estudante : estudantes) {
            estudante.mostrarDadosEstudante();
        }
    }

    public void mostrarDadosTurma() {
        System.out.println("Identificacao: " + identificacao);
    }

    void listarTurma() {
    }
}