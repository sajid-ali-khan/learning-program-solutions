package Factories;

import Documents.ExcelDocument;
import Documents.IDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public IDocument createDocument() {
        return new ExcelDocument();
    }
}
