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
class Professor extends Pessoa {
    private String siaep;

    public Professor(String nome, String cpf, String endereco, String telefone, String siaep) {
        super(nome, cpf, endereco, telefone); 
        this.siaep = siaep;
    }


    public String getSiaep() {
        return siaep;
    }

    public void setSiaep(String siaep) {
        this.siaep = siaep;
    }

    public void mostrarDadosProfessor() {
        mostrarDadosPessoa(); 
        System.out.println("SIAEP: " + siaep);
    }
}

