/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;


class Estudante extends Pessoa {
    private String matricula;
    private Curso curso; 
    private Double notaRecuperacao;
    private double novaNota;
    private Nota nota;
    
    public Estudante(String nome, String cpf, String endereco, String telefone,
                     String matricula, Curso curso) {
        super(nome, cpf, endereco, telefone); 
        this.matricula = matricula;  
        this.curso = curso;
        this.notaRecuperacao = null; 
    }
  
    public void notaFinal(double novaNota, Double notaRecuperacao){
        System.out.println("digite a nota da final: ");
        novaNota = notaRecuperacao;
    }
    public void adicionarNotaRecuperacao(double nota) {
        this.notaRecuperacao = nota;
    }
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
   
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    
     public void mostrarDadosEstudante() {
        mostrarDadosPessoa(); 
        System.out.println("Matrícula: " + matricula);
        System.out.println("Média: " + nota.media);
        System.out.println("Curso: " + curso.getNome());
         if (notaRecuperacao != null) {
            System.out.println("Nota de Recuperação: " + notaRecuperacao);
        }
    }

    
}

    
}

