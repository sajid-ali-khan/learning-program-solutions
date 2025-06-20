import documents.IDocument;
import factories.DocumentFactory;
import factories.PdfDocumentFactory;

public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        DocumentFactory factory = new PdfDocumentFactory();
        IDocument document = factory.createDocument();
        document.open();

        System.out.println("Making changes....");

        document.close();
    }
}