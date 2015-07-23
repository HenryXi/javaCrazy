package crazyJavaSet.No7_2;

import java.util.*;

/**
 * in the line 18 means that you are using the 
 * Collection ,so you can not update this collection.
 * but if you put this collection in to a Iterator and
 * loop this Iterator and then you can update the Collection
 * .
 * in a word:if you are using the thing you cannot change(update) it.
 *
 * @author yong 2013-6-11 下午4:11:34
 *
 */
public class TestForeach {
	public static void main(String[] args) {
		// 创建一个集合
		Collection<String> books = new HashSet<String>();
		books.add(new String("轻量级J2EE企业应用实战"));
		books.add(new String("Struts2权威指南"));
		books.add(new String("基于J2EE的Ajax宝典"));
		for (String obj : books) {
			String book = (String) obj;
			System.out.println(book);
			if (book.equals("Struts2权威指南")) {
				// 下面代码会引发ConcurrentModificationException异常
				books.remove(book);
			}
		}
//		Iterator iter=books.iterator();
//		while(iter.hasNext()){
//			String book=iter.next().toString();
//			if(book.equals("Struts2权威指南")){
//				iter.remove();
//			}
//		}
		System.out.println(books);
	}
}
