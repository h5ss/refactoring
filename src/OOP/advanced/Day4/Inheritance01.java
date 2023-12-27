package OOP.advanced.Day4;

public class Inheritance01 extends Calculation{
    Inheritance01(int num1, int num2){
        super(num1, num2);
    }
    public void multiplication(){
        System.out.printf("두 수의 곱셈: %d\n", num1*num2);
    }
}
