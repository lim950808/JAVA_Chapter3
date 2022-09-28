package ch09;
// 09. 추상 클래스(abstract class) 구현하기
public class Desktop extends Computer {
    @Override
    public void display() {
        System.out.println("DeskTop display");
    }

    @Override
    public void typing() {
        System.out.println("DeskTop typing");
    }

    @Override
    public void turnOff() {
        System.out.println("Desktop turnoff");
    }

}
