package c322.homework.homework4.partb;

public class HeaderDecorator extends PrinterDecorator{
    private String header;

    public HeaderDecorator(PrinterInterface printer, String header) {
        super(printer);
        this.header = header;
    }

    public void flushBuffer() {
        System.out.println(header);
        super.flushBuffer();
    }
}
