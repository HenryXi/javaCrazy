package kSwing.No12_10;
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class CustomTreeNode
{
	JFrame jf = new JFrame("�������Ľڵ�");

	JTree tree;

	//���弸����ʼ�ڵ�
	DefaultMutableTreeNode friends = new DefaultMutableTreeNode("�ҵĺ���");
	DefaultMutableTreeNode qingzhao = new DefaultMutableTreeNode("������"); 
	DefaultMutableTreeNode suge = new DefaultMutableTreeNode("�ո�����");
	DefaultMutableTreeNode libai = new DefaultMutableTreeNode("���");
	DefaultMutableTreeNode nongyu = new DefaultMutableTreeNode("Ū��");
	DefaultMutableTreeNode hutou = new DefaultMutableTreeNode("��ͷ");

	public void init()
	{
		//ͨ��add�����������ڵ�֮��ĸ��ӹ�ϵ
		friends.add(qingzhao);
		friends.add(suge);
		friends.add(libai);
		friends.add(nongyu);
		friends.add(hutou);

		//�Ը��ڵ㴴����
		tree = new JTree(friends);

		//�����Ƿ���ʾ���ڵ�ġ�չ��/�۵���ͼ��,Ĭ����false
		tree.setShowsRootHandles(true);
		//���ýڵ��Ƿ�ɼ�,Ĭ����true
		tree.setRootVisible(true);

		//����ʹ�ö��ƵĽڵ������
		tree.setCellRenderer(new ImageCellRenderer());

		jf.add(new JScrollPane(tree));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

    public static void main(String[] args) 
    {
		new CustomTreeNode().init();
    }
}
//ʵ���Լ��Ľڵ������
class ImageCellRenderer extends JPanel implements TreeCellRenderer
{
	private ImageIcon icon;
	private String name;
	//������Ƶ�Ԫ��ʱ�ı���ɫ
	private Color background;
	//������Ƶ�Ԫ��ʱ��ǰ��ɫ
	private Color foreground;

	public Component getTreeCellRendererComponent(JTree tree, Object value,
		boolean sel, boolean expanded,  boolean leaf, int row, boolean hasFocus)
	{
		icon = new ImageIcon("icon/" + value + ".gif");
		name = value.toString();
		background = hasFocus ? new Color(140 , 200 ,235) : new Color(255 , 255 , 255);
		foreground = hasFocus ? new Color(255 , 255 ,3) : new Color(0 , 0 , 0);
		//���ظ�JPanel������Ϊ��Ԫ�������
		return this;
	}
	//��дpaintComponent�������ı�JPanel�����
	public void paintComponent(Graphics g)
	{
		int imageWidth = icon.getImage().getWidth(null);
		int imageHeight = icon.getImage().getHeight(null);
		g.setColor(background);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(foreground);
		//���ƺ���ͼ��
		g.drawImage(icon.getImage() , getWidth() / 2 - imageWidth / 2 , 10 , null);
		g.setFont(new Font("SansSerif" , Font.BOLD , 18));
		//���ƺ����û���
		g.drawString(name, getWidth() / 2 - name.length() * 10 , imageHeight + 30 );
	}
	//ͨ���÷��������ø�ImageCellRenderer����Ѵ�С
	public Dimension getPreferredSize()
	{  
		return new Dimension(80, 80);
	}
}