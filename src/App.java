/*
 * Trabalho de Grau B - Programação Orientada a Objetos - Unisinos 2025/02
 * Professor Marcio Garcia
 * Alunos:
 * Victor Guimarães
 * Felipe Dias
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static void CriaProcesso(ArrayList<Processo> processos, Scanner scanner){
        System.out.println("\nEscolha o tipo de processo:");
        System.out.println("Operações suportadas: +, -, *, /");
        System.out.println("A expressão deve ser no formato: operando1 operador operando2 (ex: 3 + 4)");

        int processType = 0;
        do{    
            System.out.println("\n1 - Processo de Cálculo (ComputingProcess)");
            System.out.println("2 - Processo de Escrita (WritingProcess)");
            System.out.println("3 - Processo de Leitura (ReadingProcess)");
            System.out.println("4 - Processo de Impressão (PrintingProcess)");
            System.out.println("0 - Voltar ao menu principal");
            System.out.printf("Digite o número da opção: ");

            processType = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch(processType){
                case 1:
                    System.out.println("Insira a expressão:");
                    String expressao = scanner.nextLine();
                    processos.add(new ComputingProcess(expressao));
                    break;
                case 2:
                    System.out.println("Insira a expressão a ser salva no arquivo computation.txt:");
                    String writeExpressao = scanner.nextLine();
                    processos.add(new WritingProcess(writeExpressao));
                    break;
                case 3:
                    processos.add(new ReadingProcess(processos));
                    break;
                case 4:
                    processos.add(new PrintingProcess());
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Tipo de processo inválido.");
            }
        } while(processType != 0);
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("");
        ArrayList<Processo> processos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int menuOption = 0;
        do{
            System.out.println("\n----- MENU DE OPÇÕES -----");
            System.out.println("1 - Criar Processo");
            System.out.println("2 - Executar próximo");
            System.out.println("3 - Executar processo específico");
            System.out.println("4 - Salvar fila de processos");
            System.out.println("5 - Carregar fila de processos");
            System.out.println("0 - Sair");
            System.out.printf("Digite o número da opção: ");
            menuOption = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch(menuOption){
                case 1:
                    CriaProcesso(processos, scanner);
                    break;
                case 2:
                    if(!processos.isEmpty()){
                        Processo p = processos.remove(0);
                        p.execute();
                    } else {
                        System.out.println("Nenhum processo na fila.");
                    }
                    break;
                case 3:
                    System.out.printf("Digite o PID do processo: ");
                    int pid = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    boolean found = false;
                    for(int i = 0; i < processos.size(); i++){
                        if(processos.get(i).getPid() == pid){
                            processos.get(i).execute();
                            processos.remove(i);
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Processo não encontrado.");
                    }
                    break;
                case 4:
                    // Implementar salvamento da fila de processos
                    System.out.println("Funcionalidade não implementada.");
                    break;
                case 5:
                    // Implementar carregamento da fila de processos
                    System.out.println("Funcionalidade não implementada.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while(menuOption != 0);
        scanner.close();
    }
}
