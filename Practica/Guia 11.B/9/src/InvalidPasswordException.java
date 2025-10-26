public class InvalidPasswordException extends Exception{

    public InvalidPasswordException() {
    }

    public InvalidPasswordException(String message) {
        super(message);
    }


    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
