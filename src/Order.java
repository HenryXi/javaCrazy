

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {

	/**
	 * 
	 * 
	 * @param args
	 * @author yong 2013-8-10 上午9:37:06
	 */
	public static void main(String[] args) {
		//----------------------the first interview question-------------
		String hello="Welcome,dandan232";
		hello=hello.replaceAll("[^a-zA-Z]","").toLowerCase();
		List list=new ArrayList();
		int length=hello.length();
		for(int i=0;i<length;i++){
			list.add(hello.charAt(i));
		}
		Collections.sort(list);
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i).toString());
		}
		
		
	}
}
