package jAwt.No11_5;

import java.awt.*;
import java.awt.event.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class MultiListener
{
	private Frame f = new Frame("测试");
	private TextArea ta = new TextArea(6 , 40);
	private Button b1 = new Button("按钮一");
	private Button b2 = new Button("按钮二");
	public void init()
	{
		FirstListener fl = new FirstListener();
		b1.addActionListener(fl);
		b1.addActionListener(new SecondListener());
		b2.addActionListener(fl);
		f.add(ta);
		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		f.add(p, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	class FirstListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ta.append("第一个事件监听器被触发,事件源是：" + e.getActionCommand() + "\n");
		}
	}
	class SecondListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ta.append("单击了“" + e.getActionCommand() + "”按钮\n");
		}
	}
	public static void main(String[] args) 
	{
		new MultiListener().init();
	}
}
