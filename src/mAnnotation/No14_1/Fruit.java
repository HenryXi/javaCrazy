package mAnnotation.No14_1;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Fruit
{
	public void info()
	{ 
		System.out.println("水果的info方法。。。"); 
	}
} 

class Apple2 extends Fruit
{
	//使用@Override指定下面方法必须重写父类方法
//	@Override
	public void info()
//	public void inf0()
	{ 
		System.out.println("苹果重写水果的info方法。。。"); 
	}
}