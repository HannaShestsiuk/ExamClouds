package exceptions.registrationValidator;

class WeakPasswordException extends Exception{
    WeakPasswordException(){}
    WeakPasswordException(String message){
        super(message);
    }
}
