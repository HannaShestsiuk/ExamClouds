/**
 * Переписать класс FileInputOutputStreamDemo:
 * 1. Добавить блок try-with-resources.
 * 2. Замените for (int i = 0; i < c.length; i++)на блок for-each.
 * 3. Пусть file.txt записывается в каталог src/io.
 */
package lesson22_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class II_FileInputOutputStreamDemo {
    public static void main(String[] args) {
        char[] symbols = {'a', 'b', 'c'};

        try (OutputStream output = new FileOutputStream("src/file.txt");
             InputStream input = new FileInputStream("src/file.txt")) {

            for (char symbol : symbols) {
                // Запись каждого символа в текстовый файл
                output.write(symbol);
            }

            // Чтение текстового файла посимвольно
            int value;
            while ((value = input.read()) != -1) {
                System.out.print((char) value + " ");
            }
        } catch (IOException e) {
            System.out.print("Exception" + e.getMessage());
        }
    }
}
