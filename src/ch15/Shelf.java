package ch15;

import java.util.ArrayList;
// 15. 여러 인터페이스 구현하기, 인터페이스의 상속
public class Shelf {

    protected ArrayList<String> shelf;

    public Shelf() {
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf(){
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }

}
