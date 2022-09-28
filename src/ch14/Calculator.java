package ch14;

import ch14.Calc;

// 14. 인터페이스의 여러가지 요소
public abstract class Calculator implements Calc {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}
