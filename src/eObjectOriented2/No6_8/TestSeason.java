package eObjectOriented2.No6_8;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestSeason
{
	public TestSeason(Season s)
	{
		System.out.println(s.getName() + "��������һ��"+ s.getDesc() + "�ļ���");
	}
	public static void main(String[] args) 
	{
		//ֱ��ʹ��Season��FALL��������һ��Season����
		new TestSeason(Season.FALL);
	}
}