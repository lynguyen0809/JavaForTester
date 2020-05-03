package javafortesters;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class ex2_Conditions {
    @Test
    public void ex1IfWithoutBraces(){
        boolean truthy = true;
        if(truthy) assertTrue(truthy);
    }

    @Test
    public void ex1IfyWithBraces() {
        boolean truthy = true;
        if (truthy) {
            assertTrue(truthy);
            assertFalse(!truthy);
        }
    }

    @Test
    public void ex1IfEsleWithoutBraces(){
        boolean truthy = true;
        if (truthy) assertTrue(truthy);
        else assertFalse(truthy);
    }

    @Test
    public void ex1IfEsleWithBraces(){
        boolean truthy = false;
        if (truthy) {
            assertTrue(truthy);
            assertFalse(!truthy);
        }
        else assertFalse(truthy);
    }

    @Test
    public void ex2NestedIfElse(){
        boolean truthy = true;
        boolean falsey = false;

        if(truthy){
            if (!falsey){
                if (truthy && !falsey){
                    if (falsey || truthy){
                        System.out.println("True & False");
                        assertTrue(truthy);
                        assertFalse(falsey);
                    }
                } else {
                    System.out.println("True & True");
                    assertTrue(truthy);
                    assertTrue(falsey);
                }
            }
        } else {
            if (!truthy){
                if (falsey){
                    System.out.println("False & True");
                    assertFalse(truthy);
                    assertTrue(falsey);
                } else {
                    System.out.println("False & False");
                    assertFalse(truthy);
                    assertFalse(falsey);
                }
            }
        }

    }

    @Test
    public void ex3Switch(){
        String country = "uK";
        switch (country.toUpperCase()){
            case "UK":
                System.out.println("United Kingdom");
                break;
            case "US":
                System.out.println("United States");
                break;
            case "USA":
                System.out.println("United States");
                break;
            case "FR":
                System.out.println("France");
                break;
            case "SE":
                System.out.println("Sweden");
                break;
            default:
                System.out.println("Rest Of World");
        }
    }

}
