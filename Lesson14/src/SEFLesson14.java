import org.perf4j.LoggingStopWatch;
import org.perf4j.StopWatch;

import java.util.ArrayList;
import java.util.List;

public class SEFLesson14 {

		public static void main(String[] args) {
            StopWatch stopWatch = new LoggingStopWatch("millions");
            //asyncMillions();
            syncMillions();
            System.out.flush();
            stopWatch.stop();

		}

    public static void asyncMillions() {
        // Create 100 threads counting to one million.

        List<Thread> threads = new ArrayList<Thread>();
        for (int i = 0; i < 100; i++) {
            Runnable task = new CountToOneMillion();
            Thread worker = new Thread(task);
            worker.start();
        }

        // Loop until no threads are left running.
        int running = 0;
        do {
            running = 0;
            for (Thread thread : threads) {
                if (thread.isAlive()) {
                    running++;
                }
            }
        } while (running > 0);
    }

    public static void syncMillions() {
        // Create 100 threads counting to one million
        for (int i = 0; i < 100; i++) {
            CountToOneMillion counter = new CountToOneMillion();
            counter.run();
        }
    }
}
