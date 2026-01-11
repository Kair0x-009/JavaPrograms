package AdapterPattern;

public class Main {
    public static void main(String[] args) {
         Printer printer = new PrinterAdapter();
         Client.clientCode(printer);
    }
}
