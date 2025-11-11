/**
 * Создай интерфейс Validator с методом boolean isValid(String text).
 * Сделай реализацию EmailValidator.
 * Проверь email через @.
 */
package interfaces;

public class XVII_EmailValidator implements XVII_Validator{
    @Override
    public boolean isValid(String text) {
        return text != null && text.contains("@");
    }

    public static void main(String[] args) {
        XVII_EmailValidator validator = new XVII_EmailValidator();

        System.out.println(validator.isValid("example@mail.com"));
        System.out.println(validator.isValid("invalidemail.com"));
    }
}