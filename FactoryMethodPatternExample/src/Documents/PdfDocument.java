package Documents;

public class PdfDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening pdf document....");
    }

    @Override
    public void close() {
        System.out.println("Closing pdf document....Document closed.");
    }
}
