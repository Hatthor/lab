package md.usm.laborator1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvReaderLab1Scanner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/main/java/md/usm/laborator1/files/employees-table.csv"));
        scanner.useDelimiter(",");
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
