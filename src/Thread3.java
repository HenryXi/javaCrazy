public class Thread3 extends Thread {

	private static Object o = new Object();//三个人三根筷子,所以次只能有一个人吃饭,其他两个人等待.所以公共的三个筷子资源为一个.
	private static int count = 0;
	private char ID;
	private int id;
	//private int num = 0;

	public Thread3(int id, char ID) {
		this.id = id;
		this.ID = ID;
	}

	public void run() {
		synchronized (o) {
//			这里如果不设定吃饭的次数会出现死循环,三个农民一直吃啊吃,长生不老.
			while (true) {
				//按照ABC的顺序依次吃饭
				if (count % 3 == id) {
					System.out.println(ID+"is eating now!");
					++count;
//					++num;
					o.notifyAll();
				} else {
					try {
						o.wait();//如果轮不到自己吃饭的时候,就等着
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		(new Thread3(0, 'A')).start();
		(new Thread3(1, 'B')).start();
		(new Thread3(2, 'C')).start();
	}

}
