
package numerodigitos;
import java.util.Scanner;

public class NumeroDigitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite um valor inteiro maior ou igual a 0: ");
        int numero = scanner.nextInt();

    
        if (numero < 0) {
            System.out.println("Por favor, digite um valor inteiro maior ou igual a 0.");
        } else {
           
            int numeroDigitos = contarDigitos(numero);

            
            System.out.println("O número de dígitos é: " + numeroDigitos);
        }

        scanner.close();
    }

  
    public static int contarDigitos(int numero) {
        if (numero == 0) {
            return 1; 
        }

        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }

        return contador;
    }
}