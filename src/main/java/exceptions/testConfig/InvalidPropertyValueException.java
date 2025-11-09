package exceptions.testConfig;

public class InvalidPropertyValueException extends Exception{
    public InvalidPropertyValueException(){}
    public InvalidPropertyValueException(String message){
        super(message);
    }
}
