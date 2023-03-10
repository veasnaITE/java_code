package PacakeA;
//interface is the blueprint of class
//class is blueprint of object
//object is an instance of the class
class Student{
    //Data member
    String name,gender;
    int age;
    float average;
    //function members
    Student(){}
    Student(String name, String gender,int age, float average){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.average=average;
    }

    void showInfo(){
        System.out.println("Name: "+name); //this.name is optional
        System.out.println("Age: "+age);
        System.out.println("Average: "+average);
    }

}
public class Main {
    public static void main(String[] args) {
        Student student1 =new Student("Mr Joe","Female",12,3030.4f);
        student1.showInfo();
    }

}
