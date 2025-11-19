package exceptions.testResultsValidator;

class UnknownStatusException extends Exception{
    UnknownStatusException() {}
    UnknownStatusException(String message) {
        super(message);
    }
}
