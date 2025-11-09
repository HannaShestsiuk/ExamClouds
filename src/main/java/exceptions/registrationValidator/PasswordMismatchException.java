package exceptions.registrationValidator;

public class PasswordMismatchException extends Exception{
    public PasswordMismatchException(){}
    public PasswordMismatchException(String message){
        super(message);
    }
}
