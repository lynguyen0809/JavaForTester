package LyDemoJava;

public class Person {

    private String name;
    private Integer age;

//    Person() { }

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getUsername(){
        return this.name;
    }

    public void talk() { };
    void think() { };
    void work() { };
}
