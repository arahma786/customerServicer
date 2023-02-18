package c322.homework.homework4.partb;

public class PrinterBufferFlusherDemo {
    public static void main(String[] args) {
        String content = "This is the content to be printed";

        PrinterInterface printer = new Printer(content);

        // Add header and footer decorators at runtime
        printer = new HeaderDecorator(printer, "Header Title");
        printer = new FooterDecorator(printer, "Footer Message");

        printer.flushBuffer();
    }
}
