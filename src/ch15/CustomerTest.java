package ch15;
// 15. 여러 인터페이스 구현하기, 인터페이스의 상속
public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.hello();;

        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();

    }
}
