package OOP.advanced.Day4;

public class Calculation {
    protected int num1;
    protected int num2;
    Calculation(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void addition(){
        System.out.printf("두 수의 합: %d\n",num1+num2);
    }
    public void subtraction(){
        System.out.printf("두 수의 뺄셈: %d\n",num1-num2);
    }

}
