package Loop2;

public class Loop9054_ex {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 5; j++) {
                System.out.printf("%d * %d = %2d   ", j, i, i * j);
            }
            System.out.println();
        }
    }

}
