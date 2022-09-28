package ch16.gamelevel;

public abstract class PlayerLevel { // abstract class(추상 클래스) : 다형성을 가지는 메소드의 집합을 정의.

    // 추상화(abstract) : 클래스간의 공통점을 찾아내서 공통의 부모를 설계하는 작업.
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();


    final public void go(int count) { // go(int count) 메서드 : run() 하고 count 횟수 만큼 jump() 하고 turn() 함.
        run();
        for(int i = 0; i<count; i++) {
            jump();
        }
        turn();
    }

}