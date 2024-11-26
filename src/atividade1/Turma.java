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

class Turma{
    private String identificacao;
    private Curso curso;
    private List<Professor> professores;
    private List<Estudante> estudantes;

    
    public Turma(String identificacao, Curso curso) {
        this.identificacao = identificacao;
        this.curso = curso;
        this.professores = new ArrayList<>();
        this.estudantes = new ArrayList<>();
    }

    public Turma() {  
        this.professores = new ArrayList<>();
        this.estudantes = new ArrayList<>();
    }


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

    public void mostrarSituacaoAluno(String matricula) {
        for (Estudante estudante : estudantes) {
            if (estudante.getMatricula().equals(matricula)) {
                System.out.println("Situação do aluno " + estudante.getNome() + " (" + matricula + "): ");
                estudante.mostrarDadosEstudante();  // Exibe os dados e a situação
                return;
            }
        }
        System.out.println("Aluno com matrícula " + matricula + " não encontrado na turma.");
    }
    
    public void listarEstudantes() {
        System.out.println("Estudantes na turma " + identificacao + ":");
        for (Estudante estudante : estudantes) {
            estudante.mostrarDadosEstudante();
        }
        
    }

    public void mostrarDadosTurma() {
        System.out.println("Identificacao: " + identificacao);
        mostrarDadosProfessor();
        mostrarDadosEstudantes();
        
    }

    
     public void listarEstudantes() {
        System.out.println("Estudantes na turma " + identificacao + ":");
        for (Estudante estudante : estudantes) {
            estudante.mostrarDadosEstudante();
        }
    }

    // Mostrar dados completos da turma
    public void mostrarDadosTurma() {
        System.out.println("Identificação da turma: " + identificacao);
        listarProfessores();  // Lista os professores
        listarEstudantes();   // Lista os estudantes
    }

  

}
