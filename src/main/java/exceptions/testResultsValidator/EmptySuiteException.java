package exceptions.testResultsValidator;

class EmptySuiteException extends Exception{
    EmptySuiteException() {}
    EmptySuiteException(String message) {
        super(message);
    }
}
