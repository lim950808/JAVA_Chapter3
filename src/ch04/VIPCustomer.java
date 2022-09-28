package ch04;

public class VIPCustomer extends Customer {

    private String agentID;
    double salesRatio;

//    public VIPCustomer() {
//        super(0, "no-name");
//        customerGrade = "VIP";    //오류 발생
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//        System.out.println("VIPCustomer() call");
//    }

    // super를 이용하여 상위 클래스의 생성자 명시적으로 호출
    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }

    public String getAgentID() {
        return agentID;
    }

}