/**
 * В RegisterPage сделай публичный метод registerUser() и приватный fillInputField().
 * Объясни, зачем fillInputField() должен быть приватным.
 */
package accessModifiers;

public class XIII_RegisterPage {
    // public - accessible by any other class
    public void registerUser(String username, String password, String repeatPassword) {
        fillInputField("Username", username);
        fillInputField("Password", password);
        fillInputField("Repeat Password", repeatPassword);
    }

    // private - accessible within the declared class only
    private void fillInputField(String field, String value) {
        System.out.println("User typed in '" + value + "' into the field: [" + field + "]");
    }
}
