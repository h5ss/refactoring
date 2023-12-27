package Loop2;

import java.util.Scanner;

class RowColumn {
    static Scanner sc = new Scanner(System.in);

    public void run() {
        int row = sc.nextInt();
        int column = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

    }
}

public class Loop137_ex {
    public static void main(String[] args) {
        RowColumn rc = new RowColumn();
        rc.run();
    }
}
