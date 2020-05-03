package javafortesters;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.testng.Assert.assertTrue;

public class ex6_RandomData {
    Random generate = new Random();

    @Test
    public void randomInt(){

        int randomInt;
        List<Integer> intList = new ArrayList<>(10);

        for (int i = 0; i < 10; i++){
            randomInt = generate.nextInt();
            assertTrue(randomInt <= Integer.MAX_VALUE && randomInt >= Integer.MIN_VALUE);
            intList.add(randomInt);
        }
        System.out.println(intList);
    }

    @Test
    public void randomBoolean(){
        boolean randomBoolean;
        List<Boolean> randomList = new ArrayList<>(10);

        for (int i = 0; i < 10; i++){
            randomBoolean = generate.nextBoolean();
            assertTrue(randomBoolean == true|| randomBoolean ==false);
            randomList.add(randomBoolean);
        }

        if(randomList.contains(true)){
            if(randomList.contains(false)){
                System.out.println("The random values has included both TRUE and FALSE values" + randomList);
            }else {System.out.println("The random values has TRUE value" + randomList);}
        }
        else {
            System.out.println("The random values has FALSE value" + randomList);
        }
    }

    @Test
    public void randomLong(){
        Long randomLong;
        List<Long> longList = new ArrayList<>(10);

        for (int i = 0; i < 10; i++){
            randomLong = generate.nextLong();
            assertTrue(randomLong <= Long.MAX_VALUE && randomLong >= Long.MIN_VALUE);

            longList.add(randomLong);
        }
        System.out.println(longList);
    }

    @Test
    public void randomFloat(){
        Float randomFloat;
        Float minValue = 0.0f;
        Float maxValue = 1.0f;
        List<Float> floatList = new ArrayList<>(10);

        for (int i = 0; i < 10; i++){
            randomFloat = generate.nextFloat();
            assertTrue(randomFloat <= maxValue && randomFloat >= minValue);

            floatList.add(randomFloat);
        }
        System.out.println(floatList);
    }

    @Test
    public void randomDouble(){
        Double randomDouble;
        Double minValue = 0.0d;
        Double maxValue = 1.0d;
        List<Double> doubleList = new ArrayList<>(10);

        for (int i = 0; i < 10; i++){
            randomDouble = generate.nextDouble();
            assertTrue(randomDouble <= maxValue && randomDouble >= minValue);
            doubleList.add(randomDouble);
        }
        System.out.println(doubleList);
    }

    @Test
    public void randomBytes(){
        byte[] randomBytes = new byte[10];
        for (int i = 0; i < randomBytes.length; i++){
            generate.nextBytes(randomBytes);
            assertTrue(randomBytes[i] >= Byte.MIN_VALUE && randomBytes[i] <= Byte.MAX_VALUE);
            System.out.println(randomBytes[i]);
        }
    }

    @Test
    public void randomInt0toX(){
        int xValue = 90;
        int randomInt;
        List<Integer> intList = new ArrayList<>(10);

        for (int i = 0; i < 10; i++){
            randomInt = generate.nextInt(xValue) ;
            assertTrue(randomInt <= xValue - 1 && randomInt >= 0);
            intList.add(randomInt);
        }
        System.out.println(intList);
    }

    @Test
    public void randomString(){
        int length = 100;
        String sources = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = sources.charAt(generate.nextInt(sources.length()));
        }
        String randomString = new String(text);
        System.out.println(randomString);
    }
}
