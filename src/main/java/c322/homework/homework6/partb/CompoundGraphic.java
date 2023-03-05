package c322.homework.homework6.partb;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {
    private List<Graphic> children = new ArrayList<>();

    public void add(Graphic graphic) {
        children.add(graphic);
    }

    public void remove(Graphic graphic) {
        children.remove(graphic);
    }

    public void move(int x, int y) {
        for (Graphic child : children) {
            child.move(x, y);
        }
    }

    public void draw() {
        for (Graphic child : children) {
            child.draw();
        }
    }
}