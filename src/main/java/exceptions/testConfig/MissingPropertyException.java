package exceptions.testConfig;

class MissingPropertyException extends Exception{
    MissingPropertyException(){}
    MissingPropertyException(String message){
        super(message);
    }
}
