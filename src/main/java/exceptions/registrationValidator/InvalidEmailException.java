package exceptions.registrationValidator;

public class InvalidEmailException extends Exception{
    public InvalidEmailException(){}
    public InvalidEmailException(String message){
        super(message);
    }
}
