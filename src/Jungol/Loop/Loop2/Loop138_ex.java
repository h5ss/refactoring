package Loop2;

import javax.swing.*;
import java.util.Scanner;

class OutputProgram {
    static Scanner sc = new Scanner(System.in);

    public void run() {
        int lastNum = sc.nextInt();
        for (int i = 1; i <= lastNum; i++) {
            for (int j = 1; j <= lastNum; j++) {
                System.out.printf("(%d, %d) ", i, j);
            }
            System.out.println();
        }
    }


}

public class Loop138_ex {
    public static void main(String[] args) {
        OutputProgram op = new OutputProgram();
        op.run();
    }
}
