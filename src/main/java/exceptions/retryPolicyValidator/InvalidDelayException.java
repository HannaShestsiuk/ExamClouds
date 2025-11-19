package exceptions.retryPolicyValidator;

class InvalidDelayException extends Exception{
    InvalidDelayException(){}
    InvalidDelayException(String message){
        super(message);
    }
}
