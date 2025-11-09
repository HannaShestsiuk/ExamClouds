package exceptions.retryPolicyValidator;

public class InvalidDelayException extends Exception{
    public InvalidDelayException(){}
    public InvalidDelayException(String message){
        super(message);
    }
}
