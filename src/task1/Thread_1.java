package task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Thread_1 extends Thread{
    private static int count = 0;
    private String name;
    private File file;
    private String directory;
    private String fileExtension;

    public Thread_1(File file, String directory) {
        count++;
        this.name = Integer.toString(count);
        this.file = file;
        this.directory = directory;
        this.fileExtension = file.getName().substring(file.getName().lastIndexOf('.'));
    }

    @Override
    public void run() {
        file.renameTo(new File(directory + name + fileExtension));
    }
}
