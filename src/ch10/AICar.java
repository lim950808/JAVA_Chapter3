package ch10;
// 10. 추상 클래스의 응용 - 템플릿 메서드 패턴
public class AICar extends Car {
    @Override
    public void drive() {
        System.out.println("자율 주행합니다.");
        System.out.println("자동차가 스스로 방향을 바꿉니다.");
    }

    @Override
    public void stop() {
        System.out.println("스스로 멈춥니다.");
    }

    @Override
    public void wiper() {

    }

    @Override
    public void washCar() {
        System.out.println("자동 세차를 합니다.");
    }
}
