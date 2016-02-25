//package crazyThread.No16_6.synchronize;
//
///**
// * use synchronized key word to make sure
// * everytime there is just one Thread invoke
// * this method
// * got it !!
// *
// * @author yong 2013-6-9 下午9:16:46
// *
// */
//public class TestDraw {
//	public static void main(String[] args) {
//		// 创建一个账户
//		Account acct = new Account("1234567", 0);
//		new DrawThread("取钱者", acct, 800).start();
//		new DepositThread("存款者甲", acct, 800).start();
//		new DepositThread("存款者乙", acct, 800).start();
//		new DepositThread("存款者丙", acct, 800).start();
//	}
//}
