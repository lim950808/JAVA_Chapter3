package ch10;
// 10. 추상 클래스의 응용 - 템플릿 메서드 패턴
public class ManualCar extends Car {
    @Override
    public void drive() {
        System.out.println("사람이 운전합니다.");
        System.out.println("사람이 핸들을 조작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 밟아서 정지합니다.");
    }

    @Override
    public void wiper() {

    }
}
