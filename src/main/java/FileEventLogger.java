import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger {
    private String filename;
    private Event event;
    private File file;

    public FileEventLogger(String filename, Event event) {
        this.filename = filename;
        this.event = event;
    }

    public void init() throws IOException{
        this.file = new File(filename);
        if (!file.canWrite()) throw new IOException();
    }

    @Override
    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(file, event.toString() + "\n", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
