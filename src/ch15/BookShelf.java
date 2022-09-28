package ch15;
// 15. 여러 인터페이스 구현하기, 인터페이스의 상속
public class BookShelf extends Shelf implements Queue {

    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }

}
