package OOP.advanced.thread.threadEx;

import javax.swing.*;

public class ThreadDemo1 {
    public static void main(String[] args) {
        // 사용자 입력
        String name = JOptionPane.showInputDialog("이름을 입력하세요.");
        System.out.println("이름은 " + name + "입니다.");

        for (int i = 10; i >0 ; i--) {
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }

    }
}
