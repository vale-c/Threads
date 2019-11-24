package it.unipr.informatica.thread.example;

/**
 * MyRunnable will count the sum of the number from 1 to the parameter
 * countUntil and then write the result to the console.
 * <p>
 * MyRunnable is the task which will be performed
 *
 * Runnable is an interface which defines the run() method. This method is called
 * by the Thread object and contains the work which should be done. Therefore
 * the "Runnable" is the task to perform. The Thread is the worker who is doing
 * this task.
 *
 */
public class MyRunnable implements Runnable {
    private final long countUntil;

    MyRunnable(long countUntil) {
        this.countUntil = countUntil;
    }

    @Override
    public void run() {
        long sum = 0;
        for (long i = 1; i < countUntil; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}