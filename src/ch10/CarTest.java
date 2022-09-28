package ch10;
// 10. 추상 클래스의 응용 - 템플릿 메서드 패턴
public class CarTest {
    public static void main(String[] args) {

        Car aiCar = new AICar();
        aiCar.run();

        System.out.println("=================");

        Car manualCar = new ManualCar();
        manualCar.run();
    }
}