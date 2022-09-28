package ch15;
// 15. 여러 인터페이스 구현하기, 인터페이스의 상속
public interface Buy {

    void buy();

    default void order() {
        System.out.println("buy order");
    }
}