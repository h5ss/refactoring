package backjoon;

import java.util.Scanner;

public class BJ_6064_incaCalendar {
    static int gcdReturn(int a, int b) { // 최소공배수를 리턴해주는 함수 main 메소드에서 사용해주기 위해 static으로 선언 / 재귀함수 이용
        if (a >= b) {
            if (b == 0)
                return a;
            else
                return gcdReturn(b, a % b);
        } else {
            if (a == 0)
                return b;
            else
                return gcdReturn(a, b % a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputTimes = sc.nextInt(); // 테스트 데이터의 횟수 입력받기

        int[] lastM = new int[inputTimes]; // inputTimes 횟수 만큼의 테스트를 하기 때문에 그 만큼의 배열을 생성
        int[] lastN = new int[inputTimes];
        int[] checkX = new int[inputTimes];
        int[] checkY = new int[inputTimes];

        for (int i = 0; i < inputTimes; i++) { // 테스트할 데이터를 입력받기
            lastM[i] = sc.nextInt();
            lastN[i] = sc.nextInt();
            checkX[i] = sc.nextInt();
            checkY[i] = sc.nextInt();
        }

        for (int i = 0; i < inputTimes; i++) {

            boolean invalid = false;
            int increaseX = 1, increaseY = 1; // 초기 설정값
            int countYear = 1; // 몇번째 해인지 세주는 변수

            while (true) {
                if (checkX[i] == increaseX && checkY[i] == increaseY) { // 원하는 값이 일치하면 while 문을 빠져나와 증가한 햇수 출력
                    break;
                } else {
                    if (increaseX < lastM[i])
                        increaseX++;
                    else
                        increaseX = 1;

                    if (increaseY < lastN[i])
                        increaseY++;
                    else
                        increaseY = 1;
                    countYear++;

                    if (countYear > lastM[i] * lastN[i] / gcdReturn(lastM[i], lastN[i])) {
                        invalid = true; // 햇수를 세주는 countYear 변수가 M과 N의 최소공배수보다 크면 유효한 값을 못 찾았다 판단
                        break;          // 빠져나와서 -1 출력하게끔 동작
                    }
                }
            }
            if (invalid) {
                System.out.println(-1);
            } else
                System.out.println(countYear);
        }
    }
}
