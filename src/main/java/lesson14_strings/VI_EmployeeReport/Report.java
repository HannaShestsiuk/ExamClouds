package lesson14_strings.VI_EmployeeReport;

public class Report {
    public static void generateReport(Employee[] employees){
        System.out.printf("%3s|%-20s|%10s%n", "##", "Full Name", "Salary");
        System.out.println("-----------------------------------");

        for (Employee emp : employees) {
            System.out.printf("%3s|%-20s|%10.2f%n", emp.id, emp.fullName, emp.salary);
        }
    }
}
