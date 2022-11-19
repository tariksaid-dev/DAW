public class test2 extends Thread {
    private int threadNumber;
    public test2 (int threadNumber) {
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println(i + "from " + threadNumber);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}
