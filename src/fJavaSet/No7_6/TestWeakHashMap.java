package fJavaSet.No7_6;
import java.util.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestWeakHashMap
{
	public static void main(String[] args) 
	{
		WeakHashMap whm = new WeakHashMap();
		//��WeakHashMap����������key-value�ԣ�
		//����key���������ַ�������û���������ã�
		whm.put(new String("����") , new String("����"));
		whm.put(new String("��ѧ") , new String("����"));
		whm.put(new String("Ӣ��") , new String("�е�"));
		//��WeakHashMap������һ��key-value�ԣ�
		//��key��һ��ϵͳ������ַ�������
		whm.put("java" , new String("�е�"));
		//���whm���󣬽�����4��key-value�ԡ�
		System.out.println(whm);
		//֪ͨϵͳ����������������
		System.gc();
		System.runFinalization();
		//ͨ������£���ֻ����һ��key-value�ԡ�
		System.out.println(whm);
	}
}