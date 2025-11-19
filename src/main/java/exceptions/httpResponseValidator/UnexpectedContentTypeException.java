package exceptions.httpResponseValidator;

class UnexpectedContentTypeException extends Exception{
    UnexpectedContentTypeException(){}
    UnexpectedContentTypeException(String message){
        super(message);
    }
}
