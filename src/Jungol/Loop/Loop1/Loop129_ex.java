package Loop1;

import java.util.Scanner;

class TriangleArea {
    static Scanner sc = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.print("Base = ");
            int base = sc.nextInt();
            System.out.print("Height = ");
            int height = sc.nextInt();
            double width = (base * height) / 2.0;
            System.out.printf("Triangle width = %.1f\n", width);
            System.out.print("Continue? ");
            String yesOrNo = sc.next();
            if (yesOrNo.equals("Y") || yesOrNo.equals("y"))
                continue;
            else if (yesOrNo.equals("N") || yesOrNo.equals("n"))
                break;
            else
                break;
        }
    }
}

public class Loop129_ex {
    public static void main(String[] args) {
        TriangleArea ta = new TriangleArea();
        ta.run();
    }
}
