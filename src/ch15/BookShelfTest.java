package ch15;
// 15. 여러 인터페이스 구현하기, 인터페이스의 상속
public class BookShelfTest {
    public static void main(String[] args) {

        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("태백산맥1");
        bookQueue.enQueue("태백산맥2");
        bookQueue.enQueue("태백산맥3");

        System.out.println(bookQueue.getSize());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }
}
