
import java.util.ArrayList;
import java.util.Scanner;

public class DesafiosListaTarefas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> listaTarefas = new ArrayList<>();
        ArrayList<String> listaTarefasConcluidas = new ArrayList<>();

        int opc;
        do {
            System.out.println("\nDigite '1' para adicionar tarefas" +
                    "\nDigite '2' para concluir uma tarefa" +
                    "\nDigite '3' para visualizar suas tarefas" +
                    "\nDigite '4' para sair");

            opc = entrada.nextInt();
            entrada.nextLine();

            switch (opc) {
                case 1:
                    System.out.print("Digite a tarefa para que seja adcionada à lista: ");
                    String novaTarefa = entrada.nextLine();
                    listaTarefas.add(novaTarefa);
                    break;

                case 2:
                    if (listaTarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa foi adicionada a lista.");
                        break;
                    }
                    System.out.println("Lista de tarefas:");
                    for (int i = 0; i < listaTarefas.size(); i++) {
                        System.out.println((i + 1) + ": " + listaTarefas.get(i));
                    }
                    System.out.print("Digite o número da tarefa que foi concluída: ");
                    int indice = entrada.nextInt() - 1;

                    if (indice >= 0 && indice < listaTarefas.size()) {
                        String tarefaConcluida = listaTarefas.remove(indice);
                        listaTarefasConcluidas.add(tarefaConcluida);
                        System.out.println("Tarefa concluída.");
                    } else {
                        System.out.println("Número da tarefa inexistente.");
                    }
                    break;

                case 3:
                    System.out.println("Tarefas inacabadas:");
                    if (listaTarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa inacabada.");
                    } else {
                        for (int i = 0; i < listaTarefas.size(); i++) {
                            System.out.println((i + 1) + ": " + listaTarefas.get(i));
                        }
                    }

                    System.out.println("Tarefas concluídas:");
                    if (listaTarefasConcluidas.isEmpty()) {
                        System.out.println("Não existe tarefas concluídas.");
                    } else {
                        for (int i = 0; i < listaTarefasConcluidas.size(); i++) {
                            System.out.println((i + 1) + ": " + listaTarefasConcluidas.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Finalizando.");
                    break;

                default:
                    System.out.println("Digite um número válido");
            }
        } while (opc != 4);

        entrada.close();
    }
}