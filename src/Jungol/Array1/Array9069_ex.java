package Jungol.Array1;

import java.util.Scanner;

class CalendarProgram{
    static Scanner sc = new Scanner(System.in);
    public void run(){
        int year;
        int month;
        int[] day = new int[12];

        while (true){
            System.out.print("YEAR = ");
            year = sc.nextInt();
            System.out.print("MONTH = ");
            month = sc.nextInt();

            switch (month){
                case 1,3,5,7,8,10,12 -> day[month-1] = 31;
                case 4,6,9,11 -> day[month-1] = 30;
                case 2 -> {
                    if (year%400==0 ||(year%4==0 && year%100!=0))
                        day[month-1] = 29;
                    else
                        day[month-1] = 30;
                }
                case 0 -> System.exit(0);
                default -> {
                    System.out.println("잘못 입력하였습니다.");
                    continue;
                }

            }
            System.out.printf("입력하신 달의 날 수는 %d일입니다.\n",day[month-1]);

        }
    }
}
public class Array9069_ex {
    public static void main(String[] args) {
        CalendarProgram cp = new CalendarProgram();
        cp.run();
    }
}
