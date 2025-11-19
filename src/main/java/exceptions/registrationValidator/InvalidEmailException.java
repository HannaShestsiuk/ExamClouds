package exceptions.registrationValidator;

class InvalidEmailException extends Exception{
    InvalidEmailException(){}
    InvalidEmailException(String message){
        super(message);
    }
}
