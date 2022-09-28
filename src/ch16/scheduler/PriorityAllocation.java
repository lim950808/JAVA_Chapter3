package ch16.scheduler;
// P : 우선순위가 높은 고객우선 숙련도 높은 상담원
public class PriorityAllocation implements Scheduler { // implements : 부모는 선언만 하며, 반드시 자식이 정의를 오버라이딩해서 사용함

    @Override
    public void getNextCall() {
        System.out.println("고객등급이 높은 고객의 call을 먼저 가져옵니다");

    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 숙련도가 높은 상담원에게 먼저 배분합니다");
    }

}