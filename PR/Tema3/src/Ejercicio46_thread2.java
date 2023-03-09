public class Ejercicio46_thread2 implements Runnable {

    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("a");
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
    }
}
