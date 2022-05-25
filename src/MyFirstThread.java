public class MyFirstThread extends Thread{
    private int threadNumber;

    public MyFirstThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "Number of Thread" + threadNumber);
            try {
                //Damit man sehen kann, das beide Threads gleichzeitig laufen!
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MySecondThread extends Thread{

    private int threadNumber;

    public MySecondThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }


    @Override
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + "Number of Thread" + threadNumber );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
