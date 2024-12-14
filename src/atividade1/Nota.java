/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

/**
 *
 * @author aluno
 */
public class Nota {
    
    Double nota1;
    Double nota2;
    Double nota3;
    Double peso1;
    Double peso2;
    Double peso3;
    Double media;
    Double novaNota;
    Double notaRecuperacao;
    Curso curso;
    Turma turma;
    
    
    private Double calcularMedia() {
       if(nota1 == null || nota2 == null || nota3 == null){
           return -1.0;
       } 
        media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / 3;
        return media;
    }
    
    public String getSituacao() {
        Double media = calcularMedia();
        
         if (media >= curso.getMediaAprovacao()) {
            return "Aprovado";
        } else if (media <= curso.getMediaRecuperacao()) {
            if(notaRecuperacao != null){
                if(notaRecuperacao >= 7){
                    return "Aluno aprovado na recuperação";
                }else{
                    return "Aluno reprovado";
                }
            }
            return "Recuperação";
        } else if (media >= curso.getMediaReprovacao()) {
            return "Reprovado";
        } 
        return null;
            
    }      
       
         public void alterarNotaFinal(double novaNota) {
             
                this.notaRecuperacao = novaNota; 
                System.out.println("Nota de recuperação alterada com sucesso.");
               
    }


    
      public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Double getPeso1() {
        return peso1;
    }

    public void setPeso1(Double peso1) {
        this.peso1 = peso1;
    }

    public Double getPeso2() {
        return peso2;
    }

    public void setPeso2(Double peso2) {
        this.peso2 = peso2;
    }

    public Double getPeso3() {
        return peso3;
    }

    public void setPeso3(Double peso3) {
        this.peso3 = peso3;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }
}

