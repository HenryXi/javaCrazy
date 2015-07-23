package crazyJavaSet.No7_2;


import java.util.*;

public class TestIterator
{
	public static void main(String[] args) 
	{
		//创建一个集合
		Collection books = new HashSet();
		books.add("轻量级J2EE企业应用实战");
		books.add("Struts2权威指南");
		books.add("基于J2EE的Ajax宝典");
		//获取books集合对应的迭代器
		Iterator it = books.iterator();
		while(it.hasNext())
		{
			String book = (String)it.next();
			System.out.println(book);
			if (book.equals("Struts2权威指南"))
			{
				it.remove();
			}
			//对book变量赋值，不会改变集合元素本身
			book = "测试字符串";
		}
		System.out.println(books);
	}
}
