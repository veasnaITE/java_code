package PacakeB;
class Person{
    void showInfo(){
        System.out.println("This is person class");
    }
}
//Inheritance
//class MainPerson extends Person{
//    @Override
//    void showInfo() {
//        System.out.println("this is message from main person class");
//    }
//}

public class AnounymousCls {
    //boilerplate code


    public static void main(String[] args) {
//        Person p1 =new Person();
//        p1.showInfo();
//        MainPerson mainPerson =new MainPerson();
//        mainPerson.showInfo();
        //anonymous class
        Person obj =new Person(){
            @Override
            void showInfo() {
//                super.showInfo();
                System.out.println("this is form main class");
            }
        };
        obj.showInfo();
    }

}
