/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

import java.util.Scanner;


/**
 *
 * @author aluno
 */

  public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turma turma = new Turma();
        Curso curso = new Curso();
        
        boolean continuar = true;
        
        while (continuar) {
            
            System.out.println("1 - Cadastrar Estudante");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Cadastrar Cordenador");
            System.out.println("4 - Listar Cursos");
            System.out.println("5 - Listar Turma (Professores e Estudantes)");
            System.out.println("6 - Listar dos alunos");
            System.out.println("7 - Resultado da final");
            System.out.println("8 - Historico");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();  // quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar Estudante:");
                    System.out.print("Nome: ");
                    String nomeEstudante = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfEstudante = scanner.nextLine ();        
                    System.out.print("Endereco: ");
                    String enderecoEstudante = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefoneEstudante = scanner.nextLine();
                    scanner.nextLine();  
                    System.out.print("Matricula: ");
                    String matricula = scanner.nextLine();
                    System.out.println("Digite a nota 1: ");
                    float nota1 = scanner.nextFloat();
                    System.out.println("Digite a nota 2: ");
                    float nota2 = scanner.nextFloat();
                    System.out.println("Digite a nota 3: ");
                    float nota3 = scanner.nextFloat();
                    Estudante estudante = new Estudante(nomeEstudante, cpfEstudante, enderecoEstudante, 
                            telefoneEstudante, matricula, nota1, nota2, nota3);
                    turma.adicionarEstudante(estudante);
                    System.out.println("Estudante cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Cadastrar Professor:");
                    System.out.print("Nome: ");
                    String nomeProfessor = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfProfessor = scanner.nextLine();
                    System.out.print("Endereco: ");
                    String enderecoProfessor = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefoneProfessor = scanner.nextLine();
                    scanner.nextLine();  
                    System.out.print("SIAEP: ");
                    String siaep = scanner.nextLine();
                    Professor professor = new Professor(nomeProfessor, cpfProfessor, enderecoProfessor, telefoneProfessor, siaep);
                    turma.adicionarProfessor(professor);
                    System.out.println("Professor cadastrado com sucesso!");
                    break;

                case 3:
                      System.out.println("Cadastrar Coordenador:");
                    System.out.print("Digite o SIAEP do Professor: ");
                    String siaepCoordenador = scanner.nextLine();

                    Professor professorValido = turma.buscarProfessorPorSIAEP(siaepCoordenador);  

                    if (professorValido != null) {
                        System.out.println("Professor autenticado com sucesso!");
                        System.out.print("Digite o SIAEP do Professor que deseja cadastrar como Coordenador: ");
                        String siaepCoordenador = scanner.nextLine();
                        Professor professorCoordenador = turma.buscarProfessorPorSIAEP(siaepCoordenador);

                    } else {
                        System.out.println("Professor não encontrado com o SIAEP fornecido.");
                    }
                
                    break;     

                case 4:
                    System.out.println("Listar Cursos:");
                        curso.mostrarDadosCurso();
                    break;

               case 5:
              boolean continuarSubmenu = true;
                while (continuarSubmenu) {
                    System.out.println("\n--- Submenu Listar Alunos ---");
                    System.out.println("1 - Lista de Alunos Aprovados");
                    System.out.println("2 - Lista de Alunos na Final");
                    System.out.println("3 - Lista de Alunos Reprovados");
                    System.out.println("0 - Voltar ao Menu Principal");
                    System.out.print("Escolha uma opção: ");

              int opcaoSubmenu = scanner.nextInt();
              scanner.nextLine(); // Consome quebra de linha

            switch (opcaoSubmenu) {
              case 1:
                  System.out.println("\n--- Alunos Aprovados ---");
                  turma.listarAlunosPorSituacao("Aprovado");
              break;

              case 2:
                  System.out.println("\n--- Alunos na Final ---");
                  turma.listarAlunosPorSituacao("Final");
             break;

            case 3:
                System.out.println("\n--- Alunos Reprovados ---");
                turma.listarAlunosPorSituacao("Reprovado");
                break;

            case 0:
                continuarSubmenu = false;
                break;

            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
    }
    break;
              case 6:
                System.out.println("\n Lista de Todos os Alunos");
                turma.listarTodosAlunos();
                break;

                 case 7:
                System.out.println("1- lista de alunos aprovados na final");
                System.out.println("1- lista de alunos reprovados na final");

                int opcao = scanner.nextInt();
                scanner.nextLine();  

                    case 1:
                    System.out.println("Lista de alunos aprovados na final");
                    turma.resultadoFinalAprovados();
                    
                    break;

                    case 2:
                    System.out.println("Lista de alunos reprovados na final");
                    turma.resultadoFinalreprovados();
                    break;

                
                break;
                
                case 8:
                
                System.out.print("Digite o SIAEP do Professor: ");
                String siaepCoordenador = scanner.nextLine();

                if (professorValido != null) {
                    System.out.println("Histórico de Logs:");
                    turma.listarLogs();

                    } else {
                        System.out.println("Professor não encontrado, acesso negado");
                    }
                    break;

                case 0:
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opcao invalida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
        
    }

    
