package exceptions.httpResponseValidator;

public class UnexpectedStatusCodeException extends Exception{
    public UnexpectedStatusCodeException(){}
    public UnexpectedStatusCodeException(String message){
        super(message);
    }
}
