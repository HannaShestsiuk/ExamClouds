package exceptions.retryPolicyValidator;

class InvalidRetriesException extends Exception{
    InvalidRetriesException(){}
    InvalidRetriesException(String message){
        super(message);
    }
}
