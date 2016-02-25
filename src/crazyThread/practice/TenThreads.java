package crazyThread.practice;

/**
 * Created by yong on 2016/1/4.
 * after ten thread run finish then main thread finish
 */
public class TenThreads {
    public static void main(String[] args) throws Exception {

        for(int i=0;i<10;i++){
            TestThread testThread =new TestThread();
            testThread.start();
            testThread.join();
        }
        System.out.println("all finish");
    }

}
class TestThread extends Thread{
    @Override
    public void run(){
        System.out.println("thread finish");
    }
}
