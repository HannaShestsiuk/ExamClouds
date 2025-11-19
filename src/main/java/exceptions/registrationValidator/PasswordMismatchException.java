package exceptions.registrationValidator;

class PasswordMismatchException extends Exception{
    PasswordMismatchException(){}
    PasswordMismatchException(String message){
        super(message);
    }
}
