package Loop2;

import java.util.Scanner;

class OutputEachNum {
    static Scanner sc = new Scanner(System.in);

    public void run() {
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < 10; i++) {
            int inputNum = sc.nextInt();
            if (inputNum % 2 == 0)
                evenCount++;
            else if (inputNum % 2 == 1) {
                oddCount++;
            }
        }
        System.out.printf("even : %d\n", evenCount);
        System.out.printf("odd : %d", oddCount);
    }

}

public class Loop134_ex {
    public static void main(String[] args) {
        OutputEachNum oen = new OutputEachNum();
        oen.run();
    }
}
