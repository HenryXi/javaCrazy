package eObjectOriented2.No6_2;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

class Person3
{
	private String name;
	public Person3(String name)
	{
		this.name = name;
	}
	public void info()
	{
		System.out.println("此人名为：" + name);
	}
}
public class PrintObject
{
	public static void main(String[] args) 
	{
		//创建一个Person对象，将之赋给给p变量
		Person3 p = new Person3("孙悟空");
		//打印p所引用的Person对象
		System.out.println(p);
		System.out.println(p.hashCode());

		String pStr = p + "";
	}
}
