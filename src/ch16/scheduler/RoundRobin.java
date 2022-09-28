package ch16.scheduler;
// R : 한명씩 차례대로
public class RoundRobin implements Scheduler { // implements : 부모는 선언만 하며, 반드시 자식이 정의를 오버라이딩해서 사용함

    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 순서의 상담원에게 배분합니다.");
    }

}