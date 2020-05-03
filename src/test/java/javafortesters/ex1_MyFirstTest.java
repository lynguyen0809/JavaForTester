package javafortesters;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class ex1_MyFirstTest {
    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        assertEquals("2+2 = 4",5, answer);
    }

    @Test
    public void canAddTwoMinusTwo(){
        int answer = 2-2;
        assertEquals("2-2 = 0", 0,answer);
    }

    @Test
    public void canAddFourDivideTwo(){
        int answer = 4/2;
        assertEquals("4/2 = 2", 2,answer);
    }

    @Test
    public void canAddTwoTimeTwo(){
        int answer = 2*2;
        assertEquals("2*2 = 4", 4,answer);
    }
}
