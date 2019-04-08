import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MyFirstTest {
    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        assertEquals("2+2 = 4", 4, answer);
    }
    public void add(){
        int answer = 2+2;
        assertEquals("2+2 = 4", 5, answer);
    }
}
