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
    private Double notaRecuperacao; // Para armazenar a nota de recuperação
    private double novaNota;

    
    public Estudante(String nome, String cpf, String endereco, String telefone, String matricula,
    float nota1, float nota2, float nota3, Curso curso) {
        super(nome, cpf, endereco, telefone); 
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;    
        this.curso = curso;
        this.notaRecuperacao = null; // Sem nota de recuperação inicialmente
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
        } else if (media >= 5) {
            return "Recuperação";
        } else if (media >= 2.5) {
            return "Reprovado";
        } else if (notaRecuperacao != null) {
            if(notaRecuperacao >= 5){
                System.out.println("Aprovado");  
                finalAprovados.add();
            } else{
                 System.out.println("Reprovado");
                 finalReprovados.add();
            }
            
        } else {
            return "SN"; // Sem nota de recuperação
        }
    }
    public void notaFinal(double novaNota){
        System.out.println("digite a nota da final: ");
        
    }
        public void alterarNotaFinal(double novaNota) {
        if (this.getSituacao().equals("Final")) {
            if (usuario.getPapel().equals("Professor")) {
                this.adicionarNotaRecuperacao(novaNota);  // Altera a nota de recuperação
                System.out.println("Nota de recuperação alterada com sucesso.");
            } else {
                System.out.println("Acesso negado. Apenas o professor pode alterar a nota final.");
            }
        } else {
            System.out.println("O aluno não está na final. Nenhuma alteração permitida.");
        }
    }

    // Método para adicionar a nota de recuperação
    public void adicionarNotaRecuperacao(double nota) {
        this.notaRecuperacao = nota;
        calcularMedia();
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
         if (notaRecuperacao != null) {
            System.out.println("Nota de Recuperação: " + notaRecuperacao);
        }
    }

    
}

