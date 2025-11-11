/**
 * Валидатор e-mail и пароля при регистрации
 * Задача. Написать метод:
 * public static boolean validateRegistration(String email, String password, String confirmPassword)
 * Требования:
 * email должен содержать @ и хотя бы одну точку после @, без пробелов.
 * Если нет — InvalidEmailException.
 * password — только латиница/цифры/_, длина 8–20.
 * Если нет — WeakPasswordException.
 * password.equals(confirmPassword) — иначе PasswordMismatchException.
 * Обработка исключений внутри метода (multi-catch). Возврат true/false.
 * Исключения: три кастомных класса с двумя конструкторами (пустой и с String message).
 * Пример:
 * validateRegistration("qa.tester@mail.com", "Qwerty_12", "Qwerty_12") → true
 * validateRegistration("qa tester@mail.com", "Qwerty_12", "Qwerty_12") → false
 */
package exceptions.registrationValidator;

public class RegistrationValidator {
    public static boolean validateRegistration(String email, String password, String confirmPassword){
        try{
            String emailRegEx = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
            if(email == null || !email.matches(emailRegEx)){
                throw new InvalidEmailException("Invalid Email: " + email);
            }

            String passwordRegEx = "^[A-Za-z0-9_]{8,20}$";
            if(password == null || !password.matches(passwordRegEx)){
                throw new WeakPasswordException("Password should contain latin letters, digits or underscores, 8–20 chars");
            }
            if(!password.equals(confirmPassword)){
                throw new PasswordMismatchException("Passwords do NOT match.");
            }
            System.out.println("Congratulations! Registration is completed.");
            return true;
        }
        catch(InvalidEmailException | WeakPasswordException | PasswordMismatchException e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println(validateRegistration("qa.tester@mail.com", "Qwerty_12", "Qwerty_12"));
        System.out.println(validateRegistration("qa tester@mail.com", "Qwerty_12", "Qwerty_12"));
        System.out.println(validateRegistration("qatester@mailcom", "Qwerty_12", "Qwerty_12"));
        System.out.println(validateRegistration("qa.tester@mail.com", "short", "short"));
        System.out.println(validateRegistration("qa.tester@mail.com", "Qwerty_12", "Qwerty_13"));
    }
}
