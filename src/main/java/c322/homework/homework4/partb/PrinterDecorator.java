package c322.homework.homework4.partb;

public abstract class PrinterDecorator implements PrinterInterface{
    private PrinterInterface printer;

    public PrinterDecorator(PrinterInterface printer) {
        this.printer = printer;
    }

    public void flushBuffer() {
        printer.flushBuffer();
    }
}
