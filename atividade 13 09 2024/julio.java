import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class julio {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> nomes = new ArrayList<>();
            
            // Leitura da quantidade de nomes
            int quantidade = 0;
            while (true) {
                try {
                    System.out.print("Digite a quantidade de nomes a serem cadastrados: ");
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
            
            // Leitura dos nomes
            for (int i = 0; i < quantidade; i++) {
                String nome = "";
                while (nome.trim().isEmpty()) {
                    System.out.print("Digite o nome " + (i + 1) + ": ");
                    nome = scanner.nextLine();
                    if (nome.trim().isEmpty()) {
                        System.out.println("Nome não pode ser vazio. Por favor, digite um nome.");
                    }
                }
                nomes.add(nome);
            }
            
            // Consulta da posição
            while (true) {
                try {
                    System.out.print("Digite o número da posição que você gostaria de consultar (1 a " + quantidade + "): ");
                    int posicao = scanner.nextInt();
                    scanner.nextLine();  // Limpar o buffer do scanner
                    
                    if (posicao < 1 || posicao > quantidade) {
                        System.out.println("Número da posição inválido. Deve estar entre 1 e " + quantidade + ".");
                    } else {
                        System.out.println("Nome na posição " + posicao + ": " + nomes.get(posicao - 1));
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                    scanner.nextLine();  // Limpar o buffer do scanner
                }
            }
        }
    }
}