package accessModifiers;

public class XV_TestDataTest {
    public static void main(String[] args) {
        XV_TestData user = new XV_TestData("Alice", 25);

        // Access to the fields via public getters
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
    }
}
