package test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class SampleWatcher {

    public static void main(String[] args) {
        try {
            String path = "C:\\Data";

            System.out.println(String.format( "Monitoring %s", path  ));
            WatchService watcher = FileSystems.getDefault().newWatchService();
            Path watchPath = FileSystems.getDefault().getPath(path);

            watchPath.register(watcher, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY);

            while (true) {
                WatchKey key = watcher.take();
                for (WatchEvent<?> event: key.pollEvents()) {
                    Object context = event.context();
                    System.out.println( String.format( "Event %s, type %s", context, event.kind() ));
                    break;
                }
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
