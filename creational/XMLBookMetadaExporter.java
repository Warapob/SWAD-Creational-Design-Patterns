package creational;

import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadaExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter getBookMetadataFormatter() {
        try {
            return new XMLBookMetadataFormatter();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
}
