package exceptions.testResultsValidator;

public class UnknownStatusException extends Exception{
    public UnknownStatusException() {}
    public UnknownStatusException(String message) {
        super(message);
    }
}
