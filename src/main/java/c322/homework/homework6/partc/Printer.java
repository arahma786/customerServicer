package c322.homework.homework6.partc;

public class Printer extends PrinterController {
    private PrinterController printerState;

    public Printer(PrinterController printerState) {
        this.printerState = printerState;
        System.out.println("Powering printer on please wait. . .");
    }

    public void setPrinterState(PrinterController printerState) {
        this.printerState = printerState;
    }

    public PrinterController getPrinterState() {
        return printerState;
    }

    public void pushPrint() {
        printerState.pushPrint();
    }
}