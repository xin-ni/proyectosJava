import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresar numeros:");

    int[] arrayNumeros = new int[5];

    
    for (int i = 0; i < arrayNumeros.length; i++) {
        System.out.print("Ingrese el número " + (i + 1) + ": ");
        arrayNumeros[i] = scanner.nextInt();
    }

    
    scanner.close();

    
}
