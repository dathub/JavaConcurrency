import java.util.concurrent.Executor;

/**
 * Executor does not strictly require the task execution to be asynchronous.
 * In the simplest case, an executor can invoke the submitted task instantly in the invoking thread.
 *
 * eg:
 * main - creating an executor
 * main - Here we execute!!!!
 * main - Hope execution is done.
 */

public class ExecutorDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " - creating an executor");
        Executor executor = new Invoker();
        executor.execute(()->{
            System.out.println(Thread.currentThread().getName() + " - Here we execute!!!!");
        });
        System.out.println(Thread.currentThread().getName() + " - Hope execution is done.");
    }
}
