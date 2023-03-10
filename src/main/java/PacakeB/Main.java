package PacakeB;

import PacakeA.Worker;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        Worker son = new Worker("Son","Male",29,500);
        son.printInfo();
        Worker sam = new Worker();
        sam.name="Sam";
        sam.gender="Male";
        sam.age=18;
        sam.salary=500;
        sam.printInfo();
    }

}
