/**
 * Реализуем аутентификацию и регистрацию пользователя:
 * 1. Пусть у вас будет отображение, содержащие пары логин пользователь.
 * 2. Если пользователь ввел данные из этого отображения, он аутентифицирован.
 * 3. Если введенные логин, пароль не содержатся в отображении,
 *      проверяете их корректность (используем задание "Проверка логина и пароля") ---> I_LoginValidator.
 * 4. Если проверка пройдена, введенные логин и пароль добавляются в отображение.
 */
package lesson21_exceptions.II_AuthValidator;

import java.util.HashMap;
import java.util.Map;

import static lesson21_exceptions.I_LoginValidator.I_CredentialsValidator.checkCredentials;

public class AuthOrSignIn {
    private static final Map<String, String> userDatabase = new HashMap<>();
    public static void authenticateOrRegister(String login, String password, String confirmPassword) {
        if (userDatabase.containsKey(login)) {
            if (userDatabase.get(login).equals(password)) {
                System.out.printf("Welcome, %s.%n", login);
            } else {
                System.out.println("Invalid password!");
            }
        } else {
                if (checkCredentials(login, password, confirmPassword)) {
                userDatabase.put(login, password);
                System.out.printf("Successful sign in. %s can log in.%n", login);
            } else {
                System.out.println("Invalid login or password.");
            }
        }
    }
    public static void main(String[] args) {
        userDatabase.put("admin", "admin123");

        System.out.println("\nCase#1: Log in as an existing user");
        authenticateOrRegister("admin", "admin123", "admin123");

        System.out.println("\nCase#2: Log in with Invalid password");
        authenticateOrRegister("admin", "wrongpass", "wrongpass");

        System.out.println("\nCase#3: Sign in as a new user");
        authenticateOrRegister("new_user", "pass_123", "pass_123");

        System.out.println("\nCase#4: Sign in with invalid username");
        authenticateOrRegister("invalid-new-user", "pass_123", "different");

        System.out.println("\nCase#4: Sign in with wrong password confirmation");
        authenticateOrRegister("another_user", "pass_123", "different");
    }
}
