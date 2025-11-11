package exceptions.httpResponseValidator;

public class UnexpectedContentTypeException extends Exception{
    public UnexpectedContentTypeException(){}
    public UnexpectedContentTypeException(String message){
        super(message);
    }
}
