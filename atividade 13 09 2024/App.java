import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            HashMap<String, String> contatos = new HashMap<>();
            
            // Leitura da quantidade de contatos
            int quantidade = 0;
            while (true) {
                try {
                    System.out.print("Digite a quantidade de contatos a serem cadastrados: ");
                    quantidade = scanner.nextInt();
                    scanner.nextLine();  // Limpar o buffer do scanner
                    if (quantidade <= 0) {
                        System.out.println("A quantidade deve ser um número positivo.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                    scanner.nextLine();  // Limpar o buffer do scanner
                }
            }
            
            // Leitura dos contatos
            for (int i = 0; i < quantidade; i++) {
                System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
                String nome = scanner.nextLine();
                
                String telefone = "";
                while (true) {
                    System.out.print("Digite o telefone de " + nome + " (apenas números): ");
                    telefone = scanner.nextLine();
                    
                    if (telefone.matches("\\d+")) {  // Verifica se o telefone contém apenas dígitos
                        break;
                    } else {
                        System.out.println("Telefone inválido. Por favor, digite apenas números.");
                    }
                }
                
                contatos.put(nome, telefone);
            }
            
            // Consulta de telefone
            while (true) {
                System.out.print("Digite o nome para consultar o telefone: ");
                String nomeParaConsulta = scanner.nextLine();
                
                if (contatos.containsKey(nomeParaConsulta)) {
                    System.out.println("Telefone de " + nomeParaConsulta + ": " + contatos.get(nomeParaConsulta));
                    break;
                } else {
                    System.out.println("Nome não encontrado no banco de dados. Tente novamente.");
                }
            }
        }
    }
}