package PacakeB;

public class OuterCls {
    //data member
    String message;
    int value;

    static float money;
    void showOuterInfo(){
        System.out.println("OuterCls Message: "+message);
        System.out.println("OuterCls Value: "+value);
        //Local Inner class
        class LocalInnerCls{
            int localInnerClsValue ;
            String localInnerMessage;

        }
        LocalInnerCls localInnerCls =new LocalInnerCls();
        localInnerCls.localInnerClsValue=22;
        localInnerCls.localInnerMessage="Jivit";
        System.out.println(localInnerCls.localInnerClsValue);
        System.out.println(localInnerCls.localInnerMessage);
    }
    //static inner class
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
    //non_static Inner class
    class InnerCls{
        int innerValueCsl;
        String InnerClsMessage;
        void showInfo(){
            System.out.println("Innercls Value: "+innerValueCsl);
            System.out.println("Innercls Message: "+InnerClsMessage);
            showOuterInfo();
        }
    }

    //function member

    public static void main(String[] args) {
        OuterCls.Inner innerObj = new Inner();
//      OuterCls.Inner innerObj = new OuterCls.Inner(); //way two
      innerObj.innerValue=20;
      innerObj.innerMessage="Hello From Inner";
      innerObj.showInnerInfo();
      System.out.println("==========================");
      OuterCls.InnerCls non_staticCls = new OuterCls().new InnerCls();
      non_staticCls.InnerClsMessage="Hi from Non_static Class";
      non_staticCls.innerValueCsl=7;
      non_staticCls.showInfo();
    }
}
