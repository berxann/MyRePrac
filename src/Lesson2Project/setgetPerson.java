package Lesson2Project;

class setgetPerson extends Base{
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setFirstName(String fname) {
        this.Firstname = fname;
    }
    public String getFirstName(){
        return Firstname;
    }

    public void setLastName(String lname){
        this.LastName=lname;
    }
    public String getLastName(){
        return LastName;
    }

    public void setHello(String hello){
        this.Hello = hello;
    }
    public String getHello(){
        return Hello;
    }
    public void speak(){
        System.out.println(Hello + Firstname +" " + LastName+" " + ", " + age);
    }
}
