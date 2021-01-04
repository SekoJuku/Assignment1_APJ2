package task1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        int corecount = Runtime.getRuntime().availableProcessors();
        String dir = "C:\\Users\\troy9\\IdeaProjects\\Assignment1_APJ2\\src\\task1\\directory\\";
        File directory = new File(dir);
        File[] files = directory.listFiles();
        Thread[] threads = new Thread[corecount];

        for (int i = 0, k = 0; i < files.length;i++,k=(k+1)%corecount) {
            threads[k] = new Thread_1(files[i],dir);
            threads[k].start();
        }
    }
}
