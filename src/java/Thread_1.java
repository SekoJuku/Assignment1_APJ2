package java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Thread_1 extends Thread{
    private int count;
    private File file;
    private Path path;
    private String dir;
    private String item;


    public Thread_1(File file, String item, String dir) {
        this.file = file;
        count = 1;
        this.dir = dir;
        this.item = item;
    }

    @Override
    public void run() {
        try {
            List<String> words = Files.readAllLines(Paths.get(dir+file.getName()));
            boolean u = false;
            for (int i = 0; i < words.size(); i++) {
                String word = words.get(i);
                if(word.contains(item)) {
                    System.out.println("Found " + item + " in " + file.getName()+ " at line " + (i+1) + " through thread " + Thread.currentThread().getName());
                    u = true;
                }
            }
            if(!u) {
                System.out.println(item + " not found in " + file.getName());
            }
        } catch (IOException e) {
            System.out.println("Something is wrong in " + file.getName());
            e.printStackTrace();
        }

    }
}
