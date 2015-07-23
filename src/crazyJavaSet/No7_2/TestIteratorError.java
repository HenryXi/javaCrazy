package crazyJavaSet.No7_2;

import java.util.*;

public class TestIteratorError {
	public static void main(String[] args) {
		// 创建一个集合
		Collection books = new HashSet();
		books.add("轻量级J2EE企业应用实战");
		books.add("Struts2权威指南");
		// 获取books集合对应的迭代器
		Iterator it = books.iterator();
		while (it.hasNext()) {
			String book = (String) it.next();
			System.out.println(book);
			if (book.equals("Struts2权威指南")) {
				// 使用Iterator迭代过程中，不可修改集合元素,下面代码引发异常
				books.remove(book);
//				it.remove();
			}
		}
		System.out.println(books);
	}
}
