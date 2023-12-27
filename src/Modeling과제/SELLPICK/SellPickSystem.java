package Modeling과제.SELLPICK;

public class SellPickSystem {

    public static void main(String[] args) {
        CurrentManager currentManager = new CurrentManager();
        currentManager.currentViewInRegisterTable();
        currentManager.orderToSellCompany();
        currentManager.reflectCurrentToSystem();
    }
}
