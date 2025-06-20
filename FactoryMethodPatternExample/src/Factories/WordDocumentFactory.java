package Factories;

import Documents.IDocument;
import Documents.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public IDocument createDocument() {
        return new WordDocument();
    }
}
