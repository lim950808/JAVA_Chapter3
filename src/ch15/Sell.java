package ch15;
// 15. 여러 인터페이스 구현하기, 인터페이스의 상속
public interface Sell {

    void sell();

    default void order() {
        System.out.println("sell order");
    }
}