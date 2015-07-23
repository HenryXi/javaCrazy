package nIO.No15_3;

import java.io.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class FileInputStreamTest
{
	public static void main(String[] args) throws IOException
	{
		//创建字节输入流
		FileInputStream fis = new FileInputStream("D:/MyKanbox/MyCode/Java/javaSE_Crazy/src/nIO/No15_3/FileInputStreamTest.java");
		//创建一个长度为1024的“竹筒”
		byte[] bbuf = new byte[10];
		//用于保存实际读取的字节数
		int hasRead = 0;
		//使用循环来重复“取水”过程

		//(hasRead=fis.read(bbuf))>0 means 2 steps ,first put the value to hasRead,
		//second judge hasRead is larger then 0
		while ((hasRead = fis.read(bbuf)) > 0 )
		{
			//取出“竹筒”中水滴（字节），将字节数组转换成字符串输入！
			System.out.print(new String(bbuf , 0 , hasRead ));
		}
		fis.close();
	}
}