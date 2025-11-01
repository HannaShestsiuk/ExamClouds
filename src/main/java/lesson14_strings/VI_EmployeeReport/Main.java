/**
 * Отчет о сотрудниках, часть 1
 * Создать класс Employee, у которого есть переменные класса - fullname, salary.
 * Создать массив содержащий несколько объектов этого типа.
 * Создать класс Report  со статическим методом generateReport,
 *      в котором выводится информация о зарплате всех сотрудников.
 * Используйте форматирование строк.
 *      Пусть salary будет выровнено по правому краю,
 *      десятичное значение имеет 2 знака после запятой и можете добавить что-нибудь свое.
 */
package lesson14_strings.VI_EmployeeReport;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John Smith", 2500.50, Employee.count),
                new Employee("Alice Johnson", 3200.75, Employee.count),
                new Employee("Bob Brown", 2800.00, Employee.count),
                new Employee("Mary Davis", 4100.20, Employee.count)
        };

        Report.generateReport(employees);
    }
}
