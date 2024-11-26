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

    public Curso(String nome, int quantSemestre) {
        this.nomeCurso = nome;
        this.quantSemestre = quantSemestre;
    }

    public Curso() {}

    public String getNome() {
        return nomeCurso;
    }

    public void setNomeCurso(String nome) {
        this.nomeCurso = nomeCurso;
    }

    public int getQuantSemestre() {
        return quantSemestre;
    }

    public void setQuantSemestre(int quantSemestre) {
        this.quantSemestre = quantSemestre;
    }

    public void mostrarDadosCurso() {
        System.out.println("Nome do Curso: " + nome);
        System.out.println("Total de semestres: " + quantSemestre);
    }
}
