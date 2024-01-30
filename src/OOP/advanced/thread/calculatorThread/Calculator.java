package OOP.advanced.thread.calculatorThread;

public class Calculator {
    private int memory;

    public int getMemory(){
        return this.memory;
    }

    public synchronized void setMemory1(int memory){
        this.memory = memory;
        try{
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " : 현재금액 " + this.memory);
        }catch (InterruptedException e){
            System.out.println(Thread.currentThread().getName() + " : 현재금액 " + this.memory);
        }
    }
    public  void setMemory2(int memory){
        synchronized(this){
            this.memory = memory;
            try{
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " : 현재금액 " + this.memory);
            }catch (InterruptedException e){
                System.out.println(Thread.currentThread().getName() + " : 현재금액 " + this.memory);
            }
        }

    }

    public void setCalculator(Calculator calculator){

    }

}
