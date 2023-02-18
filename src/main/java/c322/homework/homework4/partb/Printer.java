package c322.homework.homework4.partb;

public class Printer implements PrinterInterface{
    private String buffer;

    public Printer(String buffer) {
        this.buffer = buffer;
    }

    public void flushBuffer() {
        System.out.println(buffer);
    }
}
