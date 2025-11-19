package exceptions.testResultsValidator;

class InvalidStatusException extends Exception{
    InvalidStatusException() {}
    InvalidStatusException(String message) {
        super(message);
    }
}
