package exceptionHandling.exemplofinally;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file); //Usano o Scanner para apontar/ler arquivos
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());//Código para percorrer as linhas do arquivo
            }
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());//getMessage para printar quando o arquivo
            // não é encontrado
        } finally {
            if (sc != null) { //Indepndente de o arquivo existir ou não, para o arquivo não ficar aberto
                sc.close();
            }
            System.out.println("Finally block executed");
        }
    }
}