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
   
    

    
    public Estudante(String nome, String cpf, String endereco, String telefone, String matricula,
    float nota1, float nota2, float nota3) {
        super(nome, cpf, endereco, telefone); 
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        
        
    }

  
    
    void Calcular(float nota1, float nota2, float nota3){
         
     
     media = (nota1 + nota2 + nota3) / 3;
        
        if(media >= 7 ){
            System.out.println("Aluno aprovado");
            
        } else if(media > 2.5 && media < 7) {
            
            System.out.println("Recuperação");
        } else if (media < 2.5){
            System.out.println("Aluno reprovado");
        }else{}
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
        System.out.println("Matricula: " + matricula);
        System.out.println("Media: " + media);
    }

    
}

