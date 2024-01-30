package OOP.advanced.interface_.interface_test;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog(8);
        Chicken chicken = new Chicken(3);
        Cheatable cheatableChicken = new Chicken(5);

        if (cheatableChicken instanceof Chicken){
            cheatableChicken.fly();
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d시간 후\n",i+1);
            dog.run(1);
            chicken.run(1);
            ((Chicken)cheatableChicken).run(1);

            System.out.println("개의 이동거리 =" + dog.getDistance());
            System.out.println("닭의 이동거리 =" + chicken.getDistance());
            System.out.println("날으는 닭의 거리 = " + ((Chicken)cheatableChicken).getDistance());
        }
    }
}
