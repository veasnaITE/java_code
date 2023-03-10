package PacakeA;

public class Worker {
    public String name, gender;
    public int age;
    public float salary;
    public Worker(){
        System.out.println("Default constructor of worker");
    }
    public Worker(String name, String gender, int age , float salary){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.salary=salary;
    }
    public void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }

}
