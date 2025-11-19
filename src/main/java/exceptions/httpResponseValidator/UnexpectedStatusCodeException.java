package exceptions.httpResponseValidator;

class UnexpectedStatusCodeException extends Exception{
    UnexpectedStatusCodeException(){}
    UnexpectedStatusCodeException(String message){
        super(message);
    }
}
