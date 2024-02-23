/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provas;

import java.util.Scanner;

public class Provas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a nota da Prova 1: ");
        double prova1 = scanner.nextDouble();

        System.out.print("Digite a nota da Prova 2: ");
        double prova2 = scanner.nextDouble();

        System.out.print("Digite a nota da Prova 3: ");
        double prova3 = scanner.nextDouble();

        
        double media = (prova1 + prova2 + prova3) / 3;

       
        if (media >= 7.0) {
            System.out.println("Média: " + media);
            System.out.println("Aprovado!");
        } else {
            
            System.out.println("Média: " + media);
            System.out.println("Você está em recuperação.");

            
            System.out.print("Digite a nota da recuperação: ");
            double recuperacao = scanner.nextDouble();

            
            double mediaFinal = (media + recuperacao) / 2;

            
            if (mediaFinal >= 5.0) {
                System.out.println("Média final: " + mediaFinal);
                System.out.println("Aprovado após recuperação!");
            } else {
                System.out.println("Média final: " + mediaFinal);
                System.out.println("Reprovado.");
            }
        }

       
    }
}