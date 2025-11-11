package exceptions.testResultsValidator;

public class EmptySuiteException extends Exception{
    public EmptySuiteException() {}
    public EmptySuiteException(String message) {
        super(message);
    }
}
