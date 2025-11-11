package exceptions.testResultsValidator;

public class InvalidStatusException extends Exception{
    public InvalidStatusException() {}
    public InvalidStatusException(String message) {
        super(message);
    }
}
