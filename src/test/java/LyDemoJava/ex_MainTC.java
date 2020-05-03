package LyDemoJava;

import java.util.Arrays;
import java.util.List;

public class ex_MainTC {

    public void LiLyMainTest(){
        Person a1 = new Person("LiLy", 28);
        a1.talk();

        int [] numbers = new int[10];
        String[] names = new String[5];
        int[]  numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        float[][] matrix = new float[5][3];
        String[][] sampleData = {
                {"a", "b", "c", "d"},
                {"e", "f", "g", "h"},
                {"i", "j", "k", "l"},
                {"m", "n", "o", "p"},
        };
        String[] workdayArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        List<String> workdays = Arrays.asList(workdayArray);

        int[]  numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        String[] nameList = {"Tom", "Mary", "Peter", "John", "Adam", "Justin"};

        for (String aName : nameList) {
            System.out.println(aName);
        }

            aa:
            for(int i=1;i<=3;i++){
                bb:
                for(int j=1;j<=3;j++){
                    if(i==2&&j==2){
                        break bb;
                    }
                    System.out.println(i+" "+j);
                }
            }

        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        int j=1;
        do{
            System.out.println(j);
            j++;
        }while(j<=10);
    }


}
