package OOP.advanced.Study_231222;

public class Person {
    private Phone phone;
    Person(Phone phone){
        this.phone = phone;
    }
//    public void writeMessage(){
//        String message = "안녕 반가워. 오늘 몇시에 만날까?";
//        String to = "내사랑";
//       this.phone.sendMessage(to, message);
//    }
    public void sendMessage(Phone phone){
        String to = "나의 벗";
        String message = "보고 싶다.";
        phone.sendMessage(to, message);
    }
}