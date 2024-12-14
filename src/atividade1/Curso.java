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
class Curso {
    private String nome;
    private int quantSemestre;
    private double mediaAprovacao;
    private double MediaRecuperacao;
    private double MediaReprovacao;
    

    public Curso(String nome, int quantSemestre) {
        this.nome = nome;
        this.quantSemestre = quantSemestre;
    }

    public Curso() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantSemestre() {
        return quantSemestre;
    }

    public void setQuantSemestre(int quantSemestre) {
        this.quantSemestre = quantSemestre;
    }
    
    
      public double getMediaAprovacao() {
        return mediaAprovacao;
    }

    public void setMediaAprovacao(double mediaAprovacao) {
        this.mediaAprovacao = mediaAprovacao;
    }

    public double getMediaRecuperacao() {
        return MediaRecuperacao;
    }

    public void setMediaRecuperacao(double MediaRecuperacao) {
        this.MediaRecuperacao = MediaRecuperacao;
    }

    public double getMediaReprovacao() {
        return MediaReprovacao;
    }

    public void setMediaReprovacao(double MediaReprovacao) {
        this.MediaReprovacao = MediaReprovacao;
    }

    public void mostrarDadosCurso() {
        System.out.println("Nome do Curso: " + nome);
        System.out.println("Total de semestres: " + quantSemestre);
    }
}
