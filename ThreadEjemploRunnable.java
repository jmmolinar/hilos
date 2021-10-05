public class ThreadEjemploRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 7; i++)
            System.out.println(i + " " + Thread.currentThread().getName());
        System.out.println("Termina thread " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        //1ero
        new Thread(new ThreadEjemploRunnable(), "Pepe").start();
        //2do
        new Thread(new ThreadEjemploRunnable(), "Juan").start();
        //3er
        new Thread(new ThreadEjemploRunnable(), "Carlos").start();
        //4to
        ThreadEjemploRunnable otroForma = new ThreadEjemploRunnable();
        Thread thread = new Thread(otroForma, "Luis");
        thread.start();
        System.out.println("Termina thread main");
    }
}
