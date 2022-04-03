import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * ExecutorService is a complete solution for asynchronous processing.
 * It manages an in-memory queue and schedules submitted tasks based on thread availability.
 */

public class ExecutorServiceDemo {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " - creating a FixedThreadPool executor");
        ExecutorService fixedThreadExecutor = Executors.newFixedThreadPool(10);
        fixedThreadExecutor.submit(()->{
            System.out.println(Thread.currentThread().getName() + " - We are executed from the FixedThreadPool executor");
        });
        fixedThreadExecutor.shutdown();
//        fixedThreadExecutor.shutdownNow();
//        try {
//            fixedThreadExecutor.awaitTermination(10l, TimeUnit.NANOSECONDS);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName() + " - Hope execution is done.");

        System.out.println(Thread.currentThread().getName() + " - creating a SingleThread executor");
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        singleThreadExecutor.submit(()->{
            System.out.println(Thread.currentThread().getName() + " - We are executed from the SingleThread executor");
        });
        singleThreadExecutor.shutdownNow();
    }
}
