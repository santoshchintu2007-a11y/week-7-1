/*
 * Java Multithreading Demonstration
 * Demonstrates both:
 * 1. Extending the Thread class
 * 2. Implementing the Runnable interface
 *
 * Run one method at a time by choosing the corresponding call in main().
 */

public class MultithreadingDemo {

    // Method 1: Extend Thread
    static class GoodMorningThread extends Thread {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Good Morning");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    static class HelloThread extends Thread {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Hello");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    static class WelcomeThread extends Thread {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Welcome");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    // Method 2: Implement Runnable
    static class GoodMorningRunnable implements Runnable {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Good Morning");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    static class HelloRunnable implements Runnable {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Hello");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    static class WelcomeRunnable implements Runnable {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Welcome");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    // Run the selected approach by passing "thread" or "runnable".
    public static void main(String[] args) {
        String method = args.length > 0 ? args[0] : "thread";

        if (method.equalsIgnoreCase("runnable")) {
            Thread goodMorning = new Thread(new GoodMorningRunnable());
            Thread hello = new Thread(new HelloRunnable());
            Thread welcome = new Thread(new WelcomeRunnable());

            goodMorning.start();
            hello.start();
            welcome.start();
        } else {
            Thread goodMorning = new GoodMorningThread();
            Thread hello = new HelloThread();
            Thread welcome = new WelcomeThread();

            goodMorning.start();
            hello.start();
            welcome.start();
        }
    }
}
