package trabalhandoComArquivos.manipulandoArquivos;

import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);//Nesse caso vai listar todos as pastas no caminho passado
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }
        File[] files = path.listFiles(File::isFile);//Vai listar todos os arquivos no caminho
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }
        boolean success = new File(strPath + "\\subdir").mkdir();//Cria uma subpasta nesse caso chamada de subdir no
        // diretorio passado pelo usuário
        System.out.println("Directory created successfully: " + success);
        sc.close();
    }
}
