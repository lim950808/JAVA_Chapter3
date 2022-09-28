package ch16.gamelevel;
// 중급자 레벨 : run(), jump() 가능
public class AdvancedLevel extends PlayerLevel {

    // PlayerLevel이라는 부모클래스에서 정의된 run, jump, turn과 같은 추상 메서드들을 각각의 레벨인 자식클래스에서 @Override를 이용해 재정의해 사용 가능
    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("turn 못하지롱");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****** 중급자 레벨입니다. ******");
    }
}
