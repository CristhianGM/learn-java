import java.util.Scanner;
import java.util.Random;

public class AdivinandoNumero {
    
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            testearAdivinandoNumero();
        }
    }
    // Esto es un comentario
    public static void testearAdivinandoNumero() {
        int min = 1;
        int max = 20;
        int numeroAdivinar = numeroAleatorio(min, max);
        Scanner scanner = new Scanner(System.in);
        int numeroIngresado;
        
        System.out.println("Adivina un número entre 1 Y 20:");
        
        do {
            numeroIngresado = scanner.nextInt();
            if (numeroIngresado < numeroAdivinar) {
                System.out.println("El número es mayor. Inténtalo de nuevo:");
            } else if (numeroIngresado > numeroAdivinar) {
                System.out.println("El número es menor. Inténtalo de nuevo:");
            }
        } while (numeroIngresado != numeroAdivinar);

        System.out.println("¡Correcto! Has adivinado el número " + numeroAdivinar);
        scanner.close();
    }

    public static int numeroAleatorio(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
