package ch16.scheduler;
// interface : 동일한 목적 하에 동일한 기능을 보장하기 위함.
public interface Scheduler {

    // 리턴값 없는 메서드 구현
    public void getNextCall();
    public void sendCallToAgent();

}