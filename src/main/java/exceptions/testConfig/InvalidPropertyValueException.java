package exceptions.testConfig;

class InvalidPropertyValueException extends Exception{
    InvalidPropertyValueException(){}
    InvalidPropertyValueException(String message){
        super(message);
    }
}
