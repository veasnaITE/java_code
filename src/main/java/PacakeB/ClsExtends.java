package PacakeB;
import PacakeA.Employee;
public class ClsExtends extends Employee {
    public static void main(String[] args) {
        ClsExtends newExtend = new ClsExtends();
        newExtend.name="veasna";
        newExtend.gender="Male";
        newExtend.age=39;
        System.out.println(newExtend.name);
        System.out.println(newExtend.age);
        System.out.println(newExtend.gender);
    }
}
