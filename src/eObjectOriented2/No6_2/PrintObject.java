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
		System.out.println("������Ϊ��" + name);
	}
}
public class PrintObject
{
	public static void main(String[] args) 
	{
		//����һ��Person���󣬽�֮������p����
		Person3 p = new Person3("�����");
		//��ӡp�����õ�Person����
		System.out.println(p);
		System.out.println(p.hashCode());

		String pStr = p + "";
	}
}
