package Documents;

public class ExcelDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening excel document....");
    }

    @Override
    public void close() {
        System.out.println("Closing excel document....Document closed.");
    }
}
