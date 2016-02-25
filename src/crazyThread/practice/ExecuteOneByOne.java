package crazyThread.practice;

/**
 * Created by yong on 2016/1/5.
 */
public class ExecuteOneByOne {
    public void main(String[] args) throws Exception{
        for (int i = 0; i < 3; i++) {
            TestThreadOneByOne testThreadOneByOne = new TestThreadOneByOne("thread"+i);
            testThreadOneByOne.start();
        }

        System.out.println("finish all");
        //todo how to use wait notify control Threads run one by one?
        notifyAll();
    }
}

class TestThreadOneByOne extends Thread {
    private String name = null;

    public TestThreadOneByOne(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("finish" + name);
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
