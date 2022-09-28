package ch15;
// 15. 여러 인터페이스 구현하기, 인터페이스의 상속
public class Customer implements Buy, Sell {

    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void order() {
        System.out.println("customer order");
    }

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    public void hello() {
        System.out.println("hello");
    }
}
