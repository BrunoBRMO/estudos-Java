package trabalhandoComArquivos.File$Scanner$IOException;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        File file = new File("C:\\TesteArquivo\\in.txt");
        Scanner sc = null;

        //Ao tentar instanciar o Scanner a partir do arquivo, o programa vai tentar abrir e uma exceção do tipo
        // IOException pode ser gerada, então sou obrigado a colocar a abertura do arquivo dentro do bloco try
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

    }
}
