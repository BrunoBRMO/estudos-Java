package Vetores.Exemplo1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double [n];//n será o tamanho do vetor
        for (int i = 0; i < n; i++) { //Aproveitar que nesse caso o i começa em zero para poder
            vect[i] = sc.nextDouble(); //inserir os dados no vetor
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;
        System.out.printf("Average height: %.2f%n", avg); //printf para formatar e precisa de virgla n pode +
        sc.close();
    }
}
