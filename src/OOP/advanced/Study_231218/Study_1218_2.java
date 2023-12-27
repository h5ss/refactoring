package OOP.advanced.Study_231218;

class Add{
    private Object a;
    private Object b;

    public Add(){}
    public Add(int a, int b){
        this.a = a;
        this.b = b;
        adder(a,b);
    }
    public Add(double a, double b){
        this.a = a;
        this.b = b;
        adder(a,b);
    }
    public Add(int a, double b){
        this.a = a;
        this.b = b;
        adder(a,b);
    }
    public void adder(Object num1, Object num2){
           if (num1 instanceof Integer && num2 instanceof Integer){
               int result =  ((Integer) num1).intValue()+ (Integer) num2;
               System.out.println(result);
           } else if (num1 instanceof Double && num2 instanceof Double) {
               double result = (Double) num1+ (Double) num2;
               System.out.println(result);
           }else if (num1 instanceof Integer && num2 instanceof Double){
               double result = (Integer) num1+ (Double) num2;
               System.out.println(result);
           }else
               System.exit(0);

    }
}
public class Study_1218_2 {
    public static void main(String[] args) {
        Add numObj = new Add();
        Add numObj1 = new Add(3,4);
        Add numObj2 = new Add(1.2, 1.22);
        Add numObj3 = new Add(1, 1.22);
    }
}
