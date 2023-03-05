package c322.homework.homework6.partb;

public class Dot implements Graphic {
    int x;
    int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void draw() {
        System.out.println("Drawing a dot at (" + x + ", " + y + ")");
    }
}