package arrays.unidimensional;

import java.util.Scanner;

public class Arrays_part04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vetor 1, posição " + i + ": ");
            array1[i] = scan.nextInt();
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Vetor 2, posição " + i + ": ");
            array2[i] = scan.nextInt();
        }

        System.out.println("Vetor 3 multiplicado: ");
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] * array2[i];
            System.out.print(array3[i] + " ");
        }

        scan.close();
    }
}
