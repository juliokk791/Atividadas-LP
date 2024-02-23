/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uma.livraria;

import java.util.Scanner;

public class UmaLivraria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de livros
        System.out.print("Digite a quantidade de livros desejados: ");
        int quantidadeLivros = scanner.nextInt();

        // Calcula o custo total para o Critério A
        double custoA = 0.25 * quantidadeLivros + 7.50;

        // Calcula o custo total para o Critério B
        double custoB = 0.50 * quantidadeLivros + 2.50;

        // Verifica qual é a melhor opção de desconto
        if (custoA < custoB) {
            System.out.println("Opção A é a melhor. Custo total: R$ " + custoA);
        } else if (custoB < custoA) {
            System.out.println("Opção B é a melhor. Custo total: R$ " + custoB);
        } else {
            System.out.println("Ambas as opções têm o mesmo custo. Escolha qualquer uma. Custo total: R$ " + custoA);
        }

        scanner.close();
    }
}
