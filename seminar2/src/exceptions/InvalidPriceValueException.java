package exceptions;

public class InvalidPriceValueException extends Exception{
    public InvalidPriceValueException(String message){
        super(message);
    }
}
