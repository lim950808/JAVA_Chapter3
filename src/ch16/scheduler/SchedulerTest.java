package ch16.scheduler;

import java.io.IOException;

public class SchedulerTest {

    public static void main(String[] args) throws IOException {

        System.out.println("전화 상담원 할당 방식을 선택하세요");
        System.out.println("R : 한명씩 차례대로 (RoundRobin)");
        System.out.println("L : 대기가 적은 상담원 우선 (LeaseJob)");
        System.out.println("P : 우선순위가 높은 고객우선 숙련도 높은 상담원 (PriorityAllocation)");

        int ch = System.in.read();
        Scheduler scheduler = null;

        if ( ch == 'R' || ch =='r') {
            scheduler = new RoundRobin();
        }
        else if ( ch == 'L' || ch =='l') {
            scheduler = new LeastJob();
        }
        else if ( ch == 'P' || ch =='p') {
            scheduler = new PriorityAllocation();
        }
        else {
            System.out.println("지원되지 않는 기능입니다.");
            return;
        }

        // 각각의 상담클래스들 안에서 해당 메서드 호출
        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }

}