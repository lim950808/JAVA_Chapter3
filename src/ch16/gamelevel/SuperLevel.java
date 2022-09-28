package ch16.gamelevel;
// 고급자 레벨 : run(), jump(), turn() 가능
public class SuperLevel extends PlayerLevel {

    // PlayerLevel이라는 부모클래스에서 정의된 run, jump, turn과 같은 추상 메서드들을 각각의 레벨인 자식클래스에서 @Override를 이용해 재정의해 사용 가능
    @Override
    public void run() {
        System.out.println("엄청 빠르게 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("turn 합니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****** 고급자 레벨입니다. ******");
    }
}