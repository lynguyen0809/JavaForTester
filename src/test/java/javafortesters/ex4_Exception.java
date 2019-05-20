package javafortesters;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ex4_Exception {

    @Test
    public void fixNullPointerExceptions(){
        Integer age=18;
        String ageAsString;
        String yourAge="";
            ageAsString = age.toString();
            yourAge = "You are " + age.toString() + " years old";
        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void removeAgeInTryBlock(){
        Integer age=null;
        String ageAsString;
        try{
//            age =18;
            ageAsString = age.toString();
        }catch(NullPointerException e){
            ageAsString = age.toString();
        }
    }

    @Test
    public void catchArithmeticException(){
        Integer age=null;
        String ageAsString;
        try{
            age =18;
            ageAsString = age.toString();
        }catch(ArithmeticException e){
            ageAsString = age.toString();
        }
    }

    /*@Test
    public void catchNullPointerException(){
        Integer age=null;
        String ageAsString;
        try{
            age =18;
            ageAsString = age.toString();
        }catch(NoSuchMethodException e){
            ageAsString = age.toString();
        }
    }*/

    @Test
    public void addExceptionObjects(){
        Integer age=null;
        String ageAsString;
        try{
            ageAsString = age.toString();
        }catch(NullPointerException e){
            System.out.println("This is your problem: " + e.getMessage());
            System.out.println("Your issue is here: " +e.getStackTrace());
            e.printStackTrace();
        }
    }


}
