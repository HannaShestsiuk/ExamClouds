package exceptions.retryPolicyValidator;

public class InvalidRetriesException extends Exception{
    public InvalidRetriesException(){}
    public InvalidRetriesException(String message){
        super(message);
    }
}
