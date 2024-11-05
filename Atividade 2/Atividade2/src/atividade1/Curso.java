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
    private String nomeCurso;
    private int quantSemestre;

    public Curso(String nomeCurso, int quantSemestre) {
        this.nomeCurso = nomeCurso;
        this.quantSemestre = quantSemestre;
    }

    public Curso() {}

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getQuantSemestre() {
        return quantSemestre;
    }

    public void setQuantSemestre(int quantSemestre) {
        this.quantSemestre = quantSemestre;
    }

    public void mostrarDadosCurso() {
        System.out.println("Nome do Curso: " + nomeCurso);
        System.out.println("Total de semestres: " + quantSemestre);
    }
}