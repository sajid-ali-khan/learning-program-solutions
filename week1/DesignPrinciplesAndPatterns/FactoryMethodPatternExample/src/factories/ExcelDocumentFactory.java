package factories;

import documents.ExcelDocument;
import documents.IDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public IDocument createDocument() {
        return new ExcelDocument();
    }
}
