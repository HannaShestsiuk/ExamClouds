/**
 * Копирование файла в другой файл:
 * 1. Написать класс, который копирует содержимое из одного файла в другой.
 * 2. Используем классы BufferedReader, FileReader, BufferedWriter, FileWriter.
 */

package lesson22_stream;

import java.io.*;

public class III_FileCopyBuffered {
    public static void main(String[] args){
        String sourcePath = "src/file.txt";
        String destinationPath = "src/file-copy.txt";

        try(BufferedReader in = new BufferedReader(new FileReader(sourcePath));
            BufferedWriter out = new BufferedWriter(new FileWriter(destinationPath))) {

            String str;

            while((str = in.readLine()) != null) {
                out.write(str);
                out.newLine();
            }
            System.out.println("File copied!");
        } catch (Exception e) {
            System.out.println("File is NOT copied: " + e.getMessage());
        }
    }
}
