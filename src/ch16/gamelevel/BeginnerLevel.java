package ch16.gamelevel;
// 초급자 레벨 : run() 만 가능
public class BeginnerLevel extends PlayerLevel { // extends를 통해 부모클래스에서 정의된 메서드들을 오버라이딩 필요없이 자식클래스에서 사용가능

    // PlayerLevel이라는 부모클래스에서 정의된 run, jump, turn과 같은 추상메서드들을 각각의 레벨인 자식클래스에서 @Override를 이용해 재정의 해 사용 가능
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("jump 못하지롱");
    }

    @Override
    public void turn() {
        System.out.println("turn 못하지롱");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****** 초급자 레벨입니다. ******");
    }

}