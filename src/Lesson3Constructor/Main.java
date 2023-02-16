package Lesson3Constructor;

public class Main {
    public static void main(String[] args) {


    }
}
class Human{

    private String name;
    private int age;




    public Human(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("Привет из третьего конструктора");
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age=age;
    }
}