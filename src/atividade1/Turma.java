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
    private List<Log> logs;

    
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
     public void listarEstudantes() {
        System.out.println("Estudantes na turma " + identificacao + ":");
        for (Estudante estudante : estudantes) {
            estudante.mostrarDadosEstudante();
        }
    }
       

    public void mostrarSituacaoAluno(String matricula) {
        for (Estudante estudante : estudantes) {
            if (estudante.getMatricula().equals(matricula)) {
                System.out.println("Situação do aluno " + estudante.getNome() + " (" + matricula + "): ");
                estudante.mostrarDadosEstudante();
                return;
            }
        }
        System.out.println("Aluno com matrícula " + matricula + " não encontrado na turma.");
    }
    


     public void listaDeAprovados(){
          List<Estudante> aprovados = new ArrayList<>();
          for (Estudante estudante : estudantes) {
            String situacao = estudante.getSituacao();
            if (situacao.equals("Aprovado")) {
                aprovados.add(estudante);
            }
        }
         System.out.println("Lista de alunos aprovados: ");
        for (Estudante estudante : aprovados) {
            System.out.println("Estudantes na turma " + identificacao + ":");
            estudante.mostrarDadosEstudante();
        }
         
}
     public void listaDeFinais(){
    
    List<Estudante> finais = new ArrayList<>();
    
     for (Estudante estudante : estudantes) {
            String situacao = estudante.getSituacao();
           if (situacao.equals("Final")) {
                finais.add(estudante);
            } 
    System.out.println("Lista de alunos na final: ");
     System.out.println("Estudantes na turma " + identificacao + ":");
     estudante.mostrarDadosEstudante();
        
     }
}
     public void listaDeReprovados(){
    List<Estudante> reprovados = new ArrayList<>();
    for (Estudante estudante : estudantes) {
    String situacao = estudante.getSituacao();
    if (situacao.equals("Reprovado")) {
                reprovados.add(estudante);
            }
    }
    System.out.println("Lista de alunos reprovados: ");
     for (Estudante estudante : reprovados) {
            System.out.println("Estudantes na turma " + identificacao + ":");
            estudante.mostrarDadosEstudante();
        }
    
}        
            public void listarTodosAlunos() {
    System.out.println("Lista de Estudantes:");
    for (Estudante estudante : estudantes) {
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Matrícula: " + estudante.getMatricula());
        System.out.println("Nota 1: " + estudante.getNota1());
        System.out.println("Nota 2: " + estudante.getNota2());
        System.out.println("Nota 3: " + estudante.getNota3());
        System.out.println("Média Final: " + estudante.calcularMediaFinal());
        System.out.println("Situação: " + estudante.getSituacao());
        System.out.println("---------------------------");
    }
}
    public void resultadoFinalAprovados(){
        finalAprovados.add();
    }

    public void resultadoFinalReprovados(){
        finalReprovados.add();
    }

    // Mostrar dados completos da turma
    public void mostrarDadosTurma() {
        System.out.println("Identificação da turma: " + identificacao);
        listarProfessores();  // Lista os professores
        listarEstudantes();   // Lista os estudantes
    }

    public void listarLogs() {
        if (logs.isEmpty()) {
            System.out.println("Nenhum log encontrado.");
        } else {
            for (Log log : logs) {
                System.out.println(log);
            }
        }

}
