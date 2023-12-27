package backjoon;

import java.util.Scanner;

class RemoteControl{
    Scanner sc = new Scanner(System.in);
    private String goalChannel ;
    private int breakDownButtonNum ;

    public void run(){
        int firstChannel = 100;

        goalChannel = sc.next(); // 변경하려는 채널 문자열로 입력 받기
        breakDownButtonNum = sc.nextInt(); // 고장난 버튼 개수 입력 받기

        int[] breakDownButtonArray = new int[breakDownButtonNum]; // 고장난 버튼 개수만큼 고장난 버튼의 숫자들을 받아주는 정수형 배열 생성

        for (int i = 0; i < breakDownButtonArray.length; i++) {
            breakDownButtonArray[i] = sc.nextInt(); // 고장난 버튼 몇번인지 스캐너로 받아주기
        }
        for (int i = 0; i < breakDownButtonArray.length; i++) {
//            if (goalChannel.contains(Integer.toString(breakDownButtonArray[i])))
                
        }




    }
}
public class Bj_1107 {
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl();
        rc.run();
    }
}
