package programmeweek7writing;

public class DemoN {

        int a=10,b=20;

    public static void main(String[] args) {
         DemoN obj = new DemoN();
         obj.instanceMethod();
         staticMethod();

    }
    public void instanceMethod(){
        int add = a+b;
        System.out.println("addition is " + add);

}

    public static void staticMethod(){
        DemoN manish = new DemoN();
        int minus = manish.a-manish.b;
        System.out.println("minus is "+ minus);

}
}
