
public class TestString {

	/**
	 * 
	 *
	 * @param args
	 * @author yong 2013-12-24 上午10:17:40
	 */
	public static void main(String[] args) {
		String str="Test";
		str=changeString2(str);
		System.out.println(str);
		
		int i=1;
		changeInt1(i);
		System.out.println(i);
		
		
		int j=1;
		j=changeInt2(j);
		System.out.println(j);
	}
	private static void changeString1(String str){
		str=str+"-change";
	}
	private static String changeString2(String str){
		str=str+"-change";
		return str;
	}
	private static void changeInt1(int i){
		i=i+1;
	}
	private static int changeInt2(int i){
		i=i+1;
		return i;
	}
}
