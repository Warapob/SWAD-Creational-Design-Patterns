package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Current usage
//        BookMetadataFormatter formatter = null;
//        try {
//            formatter = BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.JSON);
//            formatter.append(TestData.dragonBook);
//            formatter.append(TestData.dinosaurBook);
//            formatter.append(TestData.GoFBook);
//            formatter.append(TestData.cleanArchBook);
////            System.out.println(formatter.reset());
//            System.out.print(formatter.getMetadataString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        }



        // Expected usage
        BookMetadataExporter exporter = new JSONBookMetadataExporter();
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.GoFBook);
        exporter.add(TestData.cleanArchBook);
        exporter.remove(TestData.GoFBook);
        exporter.export(System.out);

        // *** also export data to file 'Export-Data.txt', have a look at it!. ขอบคุณครับ

//        System.out.println(System.out.getClass());
    }
}
