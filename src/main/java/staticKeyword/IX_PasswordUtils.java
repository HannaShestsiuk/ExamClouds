/**
 * В PasswordUtils сделай static boolean isStrong(String pass) —
 * проверяет длину пароля (>= 8).
 * Проверь на нескольких паролях.
 */
package staticKeyword;

public class IX_PasswordUtils {
    static boolean isStrong(String pass){
        return pass.length() >= 8;
    }

    public static void main(String[] args) {
        String pass1 = "1234567";
        String pass2 = "12345678";
        String pass3 = "123456789";

        System.out.println("Strong Passwords:");
        System.out.println(pass1 + ": " + isStrong(pass1));
        System.out.println(pass2 + ": " + isStrong(pass2));
        System.out.println(pass3 + ": " + isStrong(pass3));
    }
}
