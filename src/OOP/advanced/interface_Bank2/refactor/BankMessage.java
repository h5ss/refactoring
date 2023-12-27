package OOP.advanced.interface_Bank2.refactor;

public interface BankMessage {
    default String messageSend(String bankName, Duty duty){
        return  String.format("%s 는 %s 를 합니다.",bankName,duty.description());
    }
}
