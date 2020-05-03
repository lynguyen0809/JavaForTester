package javafortesters;

import LyDemoJava.Person;
import org.testng.annotations.Test;

public class ex5_PasswordValidation {

    @Test
    public void validatePassword(){
        User user = new User("user1", "invalidpasswordA1");

        try {
            user.setPassword(user.getPassword());
        } catch (IllegalPassword e){
            System.out.println("Invalid Password: " + e);
        }

    }


}
