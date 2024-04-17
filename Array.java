import java.util.Scanner;

public class Array {

  Scanner scanner = new Scanner(System.in);

  

    int[] arrayNumeros = new int[5];

    
    for (int i = 0; i < arrayNumeros.length; i++) {
        System.out.print("Ingrese el número " + (i + 1) + ": ");
        arrayNumeros[i] = scanner.nextInt();
    }

    
    scanner.close();

}
