package exceptions.retryPolicyValidator;

public class InvalidRetryPolicyException extends Exception{
    public InvalidRetryPolicyException(){}
    public InvalidRetryPolicyException(String message){
        super(message);
    }
}
