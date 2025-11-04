/**
 * Переписать класс FileCopy:
 * 1. Добавить блок try-with-resources.
 * 2. Добавить catch блок для обработки IOException.
 */
package lesson22_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class I_FileCopy {
    public static void main(String[] args) throws IOException {
        //FileInputStream fileIn = null;
        //FileOutputStream fileOut = null;

        try (FileInputStream fileIn = new FileInputStream("src\\io\\file.txt");
             FileOutputStream fileOut = new FileOutputStream("src\\io\\copied_file.txt")) {

            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
            System.out.println("File copied.");
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

