public class ThreadEjemploRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println(i + " " + Thread.currentThread().getName());
        System.out.println("Termina thread " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new Thread(new ThreadEjemploRunnable(), "Pepe").start();
        new Thread(new ThreadEjemploRunnable(), "Juan").start();
        new Thread(new ThreadEjemploRunnable(), "Carlos").start();
        System.out.println("Termina thread main");
    }
}
