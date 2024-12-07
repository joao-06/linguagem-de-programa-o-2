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

import java.util.ArrayList;
import java.util.List;

class Professor extends Pessoa {
    private String siaep;
    private List<Log> logs;

    public Professor(String nome, String cpf, String endereco, String telefone, String siaep) {
        super(nome, cpf, endereco, telefone); 
        this.siaep = siaep;
        this.logs = new ArrayList<>();
    }


    public String getSiaep() {
        return siaep;
    }

    public void setSiaep(String siaep) {
        this.siaep = siaep;
    }
    public void alterarNota(Estudante estudante, double novaNota, String usuario) {
       
        double antigaNota = estudante.getNota1(); // Alterar a primeira nota

        // Altera a nota do estudante
        estudante.setNota1((float) novaNota);  // Atualizando a primeira nota do aluno
        estudante.calcularMedia(); // Recalcula a média do aluno após a alteração

        // Criar o log da alteração
        String acao = "Alteração de nota de " + antigaNota + " para " + novaNota + " no aluno " + estudante.getNome();
        Log log = new Log(usuario, acao);

        // Adiciona o log à lista de logs do professor
        logs.add(log);

        // Adiciona o log à lista de logs do aluno
        estudante.getLogs().add(log);

        System.out.println("Nota alterada e log registrado com sucesso.");
    }

   // Método para exibir os logs do professor
    public void exibirLogs() {
        System.out.println("Logs do professor " + this.getNome() + ":");
        for (Log log : logs) {
            System.out.println(log);
        }
    }

    public void mostrarDadosProfessor() {
        mostrarDadosPessoa(); 
        System.out.println("SIAEP: " + siaep);
    }
}

