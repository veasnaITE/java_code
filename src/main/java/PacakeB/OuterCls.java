package PacakeB;

public class OuterCls {
    //data member
    String message;
    int value;

    static float money;
    void showOuterInfo(){
        System.out.println("OuterCls Message: "+message);
        System.out.println("OuterCls Value: "+value);
    }
    static  class Inner{
        String innerMessage;
        int innerValue;
        void showInnerInfo(){
            money=200;
            System.out.println("Static Money from Outer: "+money);
            System.out.println("Inner Message: "+innerMessage);
            System.out.println("Inner Value: "+innerValue);
        }
    }


    //function member
    public static void main(String[] args) {
        OuterCls.Inner innerObj = new Inner();
//      OuterCls.Inner innerObj = new OuterCls.Inner(); //way two
      innerObj.innerValue=20;
      innerObj.innerMessage="Hello From Inner";
      innerObj.showInnerInfo();

    }
}
