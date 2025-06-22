package factories;

import documents.IDocument;
import documents.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public IDocument createDocument() {
        return new WordDocument();
    }
}
