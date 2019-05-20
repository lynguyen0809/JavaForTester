package javafortesters;

public class User {
    private String username;
    private String password;

    public User(){
            username = "abc";
            password = "123";
    }

    public User(String username,String password){
        this.username = username;
        this.password = password;
    }

/*    private User(String username, String password, boolean b){
        this.username = username;
        try{
            setPassword(password);
        }catch (IllegalPassword e){
            throw new IllegalArgumentException("Default password incorrect ", e);
        }
    }*/

    /* This is Getter methods */
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }

//    public void setPassword(String password){
//        this.password = password;
//    }

    public void setPassword(String password) throws IllegalPassword {
        String mustIncludeDigit = ".*[0123456789]+.*";
        String mustIncludeUppercase = ".*[A-Z].*";

        if(!password.matches(mustIncludeDigit)){
            throw new IllegalPassword("Password must be included Digit[0123456789]");
        }
        if(!password.matches(mustIncludeUppercase)){
            throw new IllegalPassword("Password must be include Uppercase Letter [A-Z]");
        } else {
            System.out.println("This password is valid");
        }
        this.password = password;
    }
}
