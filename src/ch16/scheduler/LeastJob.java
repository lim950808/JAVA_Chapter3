package ch16.scheduler;
// L : 대기가 적은 상담원 우선
public class LeastJob implements Scheduler { // implements : 부모는 선언만 하며, 반드시 자식이 정의를 오버라이딩해서 사용함

    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");

    }

    @Override
    public void sendCallToAgent() {
        System.out.println("현재 상담업무가 없거나 상담대기가 가장 적은 상담원에게 할당합니다.");

    }

}