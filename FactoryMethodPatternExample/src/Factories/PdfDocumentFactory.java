package Factories;

import Documents.IDocument;
import Documents.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory{
    @Override
    public IDocument createDocument() {
        return new PdfDocument();
    }
}
