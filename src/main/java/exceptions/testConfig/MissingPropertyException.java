package exceptions.testConfig;

public class MissingPropertyException extends Exception{
    public MissingPropertyException(){}
    public MissingPropertyException(String message){
        super(message);
    }
}
