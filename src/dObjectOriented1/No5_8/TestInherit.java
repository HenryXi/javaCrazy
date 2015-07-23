package dObjectOriented1.No5_8;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

class Animal2
{
	private void beat()
	{
		System.out.println("��������...");
	}
	public void breath()
	{
		beat();
		System.out.println("��һ��������һ������������...");
	}
}
//�̳�Animal��ֱ�Ӹ��ø����breath����
class Bird2 extends Animal
{
	public void fly()
	{
		System.out.println("����������ڵķ���...");
	}
}
//�̳�Animal��ֱ�Ӹ��ø����breath����
class Wolf2 extends Animal2
{
	public void run()
	{
		System.out.println("����½���ϵĿ��ٱ���...");
	}
}
public class TestInherit
{
	public static void main(String[] args)
	{
		Bird2 b = new Bird2();
		b.breath();
		b.fly();
		Wolf2 w = new Wolf2();
		w.breath();
		w.run();		
	}
}