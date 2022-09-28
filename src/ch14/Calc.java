package ch14;
// 14. 인터페이스의 여러가지 요소
public interface Calc {
    double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() {
        System.out.println("정수 사칙연산을 구현합니다.");
        myMethod();
    }

    static int total(int[] arr) {
        int total = 0;

        for(int i: arr) {
            total += i;
        }
        myStaticMethod();
        return total;
    }

    private void myMethod() {
        System.out.println("myMethod");
    }

    private static void myStaticMethod() {
        System.out.println("myStaticMethod");
    }

}