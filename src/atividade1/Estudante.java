/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;


class Estudante extends Pessoa {
    private String matricula;
    private String nota1;
    private String nota2;
    private String nota3;
    private Double media;
   
    

    
    public Estudante(String nome, String cpf, String endereco, String telefone, String matricula,
    String nota1, String nota2, String nota3, Double media) {
        super(nome, cpf, endereco, telefone); 
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media= media;
        
    }
    
    void Calcular(){
         
        media = (nota1 + nota2 + nota3) / 3;
        
        if(media ==> 7 ){
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }

  
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNota1() {
        return nota1;
    }

    public void setNota1(String nota1) {
        this.nota1 = nota1;
    }

    public String getNota2() {
        return nota2;
    }

    public void setNota2(String nota2) {
        this.nota2 = nota2;
    }

    public String getNota3() {
        return nota3;
    }

    public void setNota3(String nota3) {
        this.nota3 = nota3;
    }
    public void mostrarDadosEstudante() {
        mostrarDadosPessoa(); 
        System.out.println("Matricula: " + matricula);
    }
}
