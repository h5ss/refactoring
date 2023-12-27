package OOP.advanced.Study_231220;

import java.util.List;
/*
주문은 '출고상태 변경하기' , '배송지 정보 변경하기', '주문 취소하기' , '결제완료하기'
*/
public class Order {
    private List<OrderLine> orderLines;
    private  ShippingInfo shippingInfo;
    private Money totalAmounts;
    private OrderState state;

    public Order(List<OrderLine> orderLines, ShippingInfo shippingInfo){
        setOrderLines(orderLines);
        setShippingInfo(shippingInfo);
    }
    private  void setOrderLines(List<OrderLine> orderLines){
        verifyAtLeastOneOrMoreOrederLines(orderLines);
        this.orderLines = orderLines;
        calculateTotalAmounts();
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        if (shippingInfo == null)
            throw  new IllegalArgumentException("no ShippiongInfo");
        this.shippingInfo = shippingInfo;
    }

    private void verifyAtLeastOneOrMoreOrederLines(List<OrderLine> orderLines){
        if (orderLines == null || orderLines.isEmpty()){
            throw new IllegalArgumentException(("no OrderLine"));
        }
    }
    private void calculateTotalAmounts(){
        int sum = orderLines.stream().mapToInt(x->x.getAmounts()).sum();
        this.totalAmounts = new Money(sum);
    }
    public void changeShipped(ShippingInfo shippingInfo){ // 출고상태로 변경하기
        verifyNotYetShipped();
        setShippingInfo(shippingInfo);
    }
    private void verifyNotYetShipped(){
        if (state != OrderState.PAYMENT_WAITING && state != OrderState.PREPARING)
            throw new IllegalArgumentException("already shipped");
    }
    public void changeShippongInfo(ShippingInfo newShipping){}
    public void cancel(){
        verifyNotYetShipped();
        this.state = OrderState.CANCELED;
    }
    public void completePayment(){}
}
