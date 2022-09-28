package ch10;
// 10. 추상 클래스의 응용 - 템플릿 메서드 패턴
public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();
    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {}

    final public void run() { // 순서를 바꿀 수 없기 때문에 final로 고정
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
        washCar();
    }
}
