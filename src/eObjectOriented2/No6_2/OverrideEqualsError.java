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
 
//����һ��Person��
class Person
{
	//��дequals�������ṩ�Զ������ȱ�׼
	public boolean equals(Object obj)
	{
		//�����жϣ����Ƿ���true����Person�������κζ������
		return true;
	}
}
//����һ��Dog����
class Dog{}
public class OverrideEqualsError
{
	public static void main(String[] args) 
	{
		Person p = new Person();
		System.out.println("Person�����Ƿ�equals Dog����" + p.equals(new Dog()));
		System.out.println("Person�����Ƿ�equals String����" + p.equals(new String("Hello")));
	}
}