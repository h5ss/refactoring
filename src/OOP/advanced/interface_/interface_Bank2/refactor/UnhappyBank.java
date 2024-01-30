package OOP.advanced.interface_.interface_Bank2.refactor;

/**
 * packageName : oop.isp.before
 * fileName : BBAnk
 * author :
 * date : 2023-12-27
 * description : 객체지향 원칙 인터페이스 분리 원칙(Interface Segregation Principle)
 */
public class UnhappyBank implements PrivateBankingFinance {
    @Override
    public void doPersonalFinance() {
        System.out.println(this.messageSend(this.getClass().getSimpleName(), OOP.advanced.interface_.interface_Bank2.refactor.Duty.PERSONAL_FINANCE));
    }

    @Override
    public void doEnterpriseFinance() {
        System.out.println(this.messageSend(this.getClass().getSimpleName(), OOP.advanced.interface_.interface_Bank2.refactor.Duty.ENTERPRISE_FINANCE));
    }

    @Override
    public void doPrivateBanking() {
        System.out.println(this.messageSend(this.getClass().getSimpleName(), Duty.PB));
    }
}
