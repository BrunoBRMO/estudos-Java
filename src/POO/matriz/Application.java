package POO.matriz;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o tamanho do arranjo:");
        int n = sc.nextInt();
        int[][] mat = new int[n][n]; //2 cochetes para indicar que é um arranjo bidimensional, Matriz

        for (int i = 0; i < mat.length; i++) { // i -> percorre as linhas da matriz
            for (int j = 0; j < mat[i].length; j++) { // j -> percorre as colunas da matriz
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negative numbers: " + count);

        sc.close();
    }
}
