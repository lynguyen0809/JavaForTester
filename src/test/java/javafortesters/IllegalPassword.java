package javafortesters;
import java.lang.Exception;

public class IllegalPassword extends Exception {
    public IllegalPassword(String message) {
        super(message);
    }
}
