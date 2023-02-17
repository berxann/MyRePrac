package Lesson2Project;
import java.util.Scanner; //говнище без конструкторов
import java.util.concurrent.TimeUnit;
public class Main extends Base {
    public static void main(String[] args) throws InterruptedException {

        Base student1 = new Base();
        Base student2 = new Base();
        Base student3 = new Base();

        student1.setAge(47);
        student1.setFirstName("Сергей");
        student1.setLastName("Бурунов");
        student1.setHello("Приветствую, коллеги. Позовльте мне представиться. ");

        student2.setAge(29);
        student2.setFirstName("Валентин");
        student2.setLastName("Стрыкало");
        student2.setHello("Здраствуйте. Меня зовут ");

        student3.setAge(14);
        student3.setFirstName("Тимофей");
        student3.setLastName("Лоскутов");
        student3.setHello("Привет, я ");

        student1.speak();
        TimeUnit.MILLISECONDS.sleep(2000);
        student2.speak();
        TimeUnit.MILLISECONDS.sleep(2000);
        student3.speak();
        TimeUnit.MILLISECONDS.sleep(2000);

        if (student2.getAge() == student3.getAge()) {
            System.out.println("Сергей Бурунов удивляется  ");
            System.out.println(" — Так у нас еще и возраст одинаковый, да?");
        } else {
            System.out.println("Сергей Бурунов: Тут никому еще не стукнуло 47? ");
        }
        TimeUnit.MILLISECONDS.sleep(2000);

        System.out.println("Пользователь, а тебя как зовут?");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();


        if(s.equals(student3.getFirstName()) || s.equals(student2.getFirstName()) || s.equals(student1.getFirstName())) {
            System.out.println("Ваше имя совпало с одним из наших героев! ");
        }
        else{
            System.out.println("Поздравляем! У вас уникальное имя!");
        }
    }}
