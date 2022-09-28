package ch09;
// 09. 추상 클래스(abstract class) 구현하기
public abstract class NoteBook extends Computer {
    @Override
    public void display() {
        System.out.println("NoteBook display");
    }
}
