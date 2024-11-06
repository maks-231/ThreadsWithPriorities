import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

public class ThreadsWithPriorities {
    public static void main(String args[]) {
        PrintingStringThread thread1 = new PrintingStringThread("Hello world from thread 1!");
        PrintingStringThread thread2 = new PrintingStringThread("Hello world from thread 2!");

        thread1.setPriority(MIN_PRIORITY);
        thread2.setPriority(MAX_PRIORITY);

        System.out.println("Current thread priority : " + Thread.currentThread().getPriority());
        System.out.println("thread1 priority : " + thread1.getPriority());
        System.out.println("thread2 priority : " + thread2.getPriority());

        thread1.start();
        thread2.start();
    }
}
