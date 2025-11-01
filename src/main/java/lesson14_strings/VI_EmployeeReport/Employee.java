package lesson14_strings.VI_EmployeeReport;

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
}
