package exceptions.retryPolicyValidator;

class InvalidRetryPolicyException extends Exception{
    InvalidRetryPolicyException(){}
    InvalidRetryPolicyException(String message){
        super(message);
    }
}
