/**
 * Добавить метод в класс Employee, который будет записывать отчет в файл.
 * Используем класс PrintWriter.
 */
package lesson14_strings.VI_EmployeeReport;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Employee {
    String fullName;
    double salary;
    static int count = 1;
    int id;

    public Employee(String fullName, double salary, int id){
        ++count;
        this.fullName = fullName;
        this.salary = salary;
        this.id = id;
    }

    public void writeReportToFile(){
        String filePath = "src/employee_report.txt";

        try (PrintWriter out = new PrintWriter(new FileWriter(filePath, true))){
            out.printf("%3s|%-20s|%10.2f%n", id, fullName, salary);
        } catch (IOException e){
            System.out.println("Report is not saved: " + e.getMessage());
        }
    }
}
