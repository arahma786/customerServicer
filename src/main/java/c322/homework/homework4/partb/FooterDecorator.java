package c322.homework.homework4.partb;

public class FooterDecorator extends PrinterDecorator{
    private String footer;

    public FooterDecorator(PrinterInterface printer, String footer) {
        super(printer);
        this.footer = footer;
    }

    public void flushBuffer() {
        super.flushBuffer();
        System.out.println(footer);
    }
}
