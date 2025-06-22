package documents;

public class WordDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening word document....");
    }

    @Override
    public void close() {
        System.out.println("Closing word document....Document closed.");
    }
}
