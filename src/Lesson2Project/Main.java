package Lesson2Project;
import java.util.Scanner; //говнище без конструкторов

public class Main extends Base {
    public static void main(String[] args) {

        Object obj = new Object();

        setgetPerson student1 = new setgetPerson();
        setgetPerson student2 = new setgetPerson();
        setgetPerson student3 = new setgetPerson();

        student1.setAge(15);
        student1.setFirstName("Аля");
        student1.setLastName("Ковалева");
        student1.setHello("Приветствую, коллеги. Позовльте мне представиться. ");

        student2.setAge(14);
        student2.setFirstName("Полина");
        student2.setLastName("Дейнес");
        student2.setHello("Здраствуйте. Меня зовут ");

        student3.setAge(14);
        student3.setFirstName("Тимофей");
        student3.setLastName("Лоскутов");
        student3.setHello("Привет! Я ");

        student1.speak();
        student2.speak();
        student3.speak();

        if (student2.getAge() == student3.getAge()) {
            System.out.println("Полина Дейнес — Тимофею Лоскутову: ");
            System.out.println(" — Так у нас еще и возраст одинаковый, да?");
        } else {
            System.out.println("Хм, но у нас видимо разный возраст");
        }

        System.out.println("А вас как зовут? ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();


        if(s.equals(student3.getFirstName())){
            System.out.println("Мы тески! ");
        }
      else{
            System.out.println("Имя разные");
        }
    }}

