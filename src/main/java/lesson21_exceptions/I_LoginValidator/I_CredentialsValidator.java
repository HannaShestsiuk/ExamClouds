/**
 * Проверка логина и пароля
 * 1. Создать статический метод который принимает на вход три параметра:
 *      login, password и confirmPassword.
 * 2. Login должен содержать только латинские буквы, цифры и знак подчеркивания.
 *      Длина login должна быть меньше 20 символов.
 *      Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 * 3. Password должен содержать только латинские буквы, цифры и знак подчеркивания.
 *      Длина password должна быть меньше 20 символов.
 *      Также password и confirmPassword должны быть равны.
 *      Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 * 4. WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
 * 5. Обработка исключений проводится внутри метода.
 * 6. Используем multi-catch block.
 * 7. Метод возвращает true, если значения верны или false в другом случае.
 */
package lesson21_exceptions.I_LoginValidator;

public class I_CredentialsValidator {
    public static boolean checkCredentials(String login, String password, String confirmPassword) {
        try {
            if (login == null
                    || !login.matches("[a-zA-Z0-9_]+")
                    || login.length() >= 20) {
                throw new WrongLoginException("Login should contain only letters, digits, underscore and be < 20 characters.");
            }
            if (password == null
                    || !password.matches("[a-zA-Z0-9_]+")
                    || password.length() >= 20
                    || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password should contain only letters, digits, underscore, be < 20 characters, and match confirmPassword.");
            }
            System.out.println("User is signed in.");
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public static void main (String[]args){
        checkCredentials("user_1", "pass_123", "pass_123");
        checkCredentials("user_1", "pass_123", "pass123");
        checkCredentials("user!1", "pass_123", "pass_123");
        checkCredentials("username_exceeding_20", "pass_123", "pass_123");
    }
}
