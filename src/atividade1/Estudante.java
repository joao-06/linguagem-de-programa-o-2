/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;


class Estudante extends Pessoa {
    private String matricula;
    private float nota1;
    private float nota2;
    private float nota3;
    private double media;
    private Curso curso; //relacionar com a classe Curso

    
    public Estudante(String nome, String cpf, String endereco, String telefone, String matricula,
    float nota1, float nota2, float nota3, Curso curso) {
        super(nome, cpf, endereco, telefone); 
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;    
        this.curso = curso;
        calcularMedia();
    }

     private void calcularMedia() {
        media = (nota1 + nota2 + nota3) / 3;
    }

    public double getMedia() {
        return media;
    }

    public String getSituacao() {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 2.5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
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

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }
     public void mostrarDadosEstudante() {
        mostrarDadosPessoa(); 
        System.out.println("Matrícula: " + matricula);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + getSituacao());
        System.out.println("Curso: " + curso.getNome());
    }

    
}

