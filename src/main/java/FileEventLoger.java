import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * user
 * 14.12.2016
 */
public class FileEventLoger implements EventLogger {
    String fileName;
    File file;


    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(file, event.getMsg(), true);
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public void init() throws IOException {
        this.file = new File(fileName);
        // check file write access
    }
}
