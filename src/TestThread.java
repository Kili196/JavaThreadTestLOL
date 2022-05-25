import com.sun.tools.javac.Main;

public class TestThread{
    public static int amount = 0;

    public static void main(String[] args) {
        MyFirstThread myFirstThread = new MyFirstThread(1);
        myFirstThread.start();
        MyFirstThread mySecondThread = new MyFirstThread(2);
        mySecondThread.start();
        MySecondThread mySecondThread1 = new MySecondThread(3);
        mySecondThread1.start();

    }




}
