package javafortesters;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

public class ex3_ArrayAndLoop {
    @Test
    public void ex1_ex2_assertArrayValues(){
        User[] users = new User[3];
        users[0] = new User("user1", "password1");
        users[1] = new User("user2", "password2");
        users[2] = new User("user3", "password3");

        assertEquals("user1",users[0].getUsername());
        assertEquals("user2",users[1].getUsername());
        assertEquals("user3",users[2].getUsername());

        for(int i = 0; i < users.length; i++){
            String userName = users[i].getUsername();
            System.out.println(userName);
        }
    }

    @Test
    public void ex3_sortArray(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Arrays.sort(workdays);

        assertEquals("Friday", workdays[0]);
        assertEquals("Monday", workdays[1]);
        assertEquals("Thursday", workdays[2]);
        assertEquals("Tuesday", workdays[3]);
        assertEquals("Wednesday", workdays[4]);
    }

    @Test
    public void ex3_sortMixedArray(){
        String[] mixedWorkdays = {"monday", "Tuesday", "WedNesday", "thursday", "Friday"};
        Arrays.sort(mixedWorkdays);

        assertEquals("Friday", mixedWorkdays[0]);
        assertEquals("Tuesday", mixedWorkdays[1]);
        assertEquals("WedNesday", mixedWorkdays[2]);
        assertEquals("monday", mixedWorkdays[3]);
        assertEquals("thursday", mixedWorkdays[4]);
    }

    @Test
    public void ex4_fillArrayWithObject() {
        User[] users = new User[100];

        /*Fill 100 users to users array*/
        for (int i = 0; i < 100; i++) {
//            System.out.println("Username"+i);
            Arrays.fill(users, i, i+1, new User("user" + (i+1), "password" + (i+1)));
        }

        for (int j = 0; j < users.length; j++){
            /*Check the array was created correctly*/
            System.out.println(users[j].getUsername());
            System.out.println(users[j].getPassword());

            /*Assert that the array was filled properly*/
            assertEquals(users[j].getUsername(), "user"+(j+1));
            assertEquals(users[j].getPassword(), "password"+(j+1));
        }


    }
}
