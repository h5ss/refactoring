package OOP.advanced.interface_4_231226;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("Bus Drive");
    }
    
    public void checkFare(){
        System.out.println("승차요금을 확인해 주세요!");
    }

}
