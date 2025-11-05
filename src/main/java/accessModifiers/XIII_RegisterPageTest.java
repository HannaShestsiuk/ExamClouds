package accessModifiers;

public class XIII_RegisterPageTest {
    public static void main(String[] args) {
        XIII_RegisterPage page = new XIII_RegisterPage();
        page.registerUser("admin", "12345678", "12345678");
        //page.fillInputField("Login", "test"); // Compilation error
        // private fillInputField() is auxiliary internal method used only inside XII_RegisterPage,
        // It is NOT accessible outside the declared class
    }
}
