package AdapterPattern;

public class PrinterAdapter implements Printer{
    private LegacyPrinter legacyPrinter = new LegacyPrinter();
    public void print(){
        legacyPrinter.printDocument();
    }
}
