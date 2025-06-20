package factories;

import documents.IDocument;
import documents.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory{
    @Override
    public IDocument createDocument() {
        return new PdfDocument();
    }
}
