package VoidNeVoid;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.age = 25;
        person1.name = "Роман";

        person2.age = 47;
        person2.name =  "Ваня";

        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("первому человеку до пенсии " + year1 + " лет");
        System.out.println("второму человеку до пенсии " + year2 + " лет");
    }
}
class Person{
    String name;
    int age;

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }
}