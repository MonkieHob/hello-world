package com.tisson.applet;

import java.awt.GridBagConstraints;
import java.awt.Insets;

@SuppressWarnings("serial")
public class Constraints extends GridBagConstraints{
	
	//Contructor
	public Constraints(int gridwidth, int gridheight)
	{
		super();
		this.gridwidth = gridwidth;
		this.gridheight = gridheight;
	}
	
	/*
	 * Constructor
	 * @param gridx ���Ͻ���λ��
	 * @param gridy ���Ͻ���λ��
	 * @param gridwidth ��ռ����
	 * @param gridheight ��ռ����
	 */
	public Constraints(int gridx, int gridy, int gridwidth, int gridheight)
	{
		super();
		this.gridx = gridx;
		this.gridy = gridy;
		this.gridwidth = gridwidth;
		this.gridheight = gridheight;
	}
	
	/*
	 * ���䷽ʽ
	 * GridBagConstraints.WEST/EAST/NORTH/SOUTH
	 */
	public Constraints setAnchor(int anchor)
	{
		this.anchor = anchor;
		return this;
	}
	
	/*
	 * �Ƿ����켰���췽��  
	 * GridBagConstraints.NONE/HORIZONTAL/VERTICAL/BOTH
	 */
	public Constraints setFill(int fill)
	{
		this.fill = fill;
		return this;
	}
	
	/*
	 * x��y�����ϵ����� 
	 * 0  ��ȫ������
	 * 100 ��ȫ���� 
	 */
	public Constraints setWeight(double weightx, double weighty)
	{
		this.weightx = weightx;
		this.weighty = weighty;
		return this;
	}
	
	/*
	 * �ⲿ���
	 * ��λ������ 
	 */
	public Constraints setInsets(int distanceL, int distanceR, int distanceU, int distanceD)
	{
		this.insets = new Insets(distanceL, distanceR, distanceU, distanceD);
		return this;
	}
	
	/*
	 * �ڲ���䣬������С��С
	 */
	public Constraints setIpad(int ipadx, int ipady)
	{
		this.ipadx = ipadx;
		this.ipady = ipady;
		return this;
	}
	
	public String toString()
	{
		return "gridx=" + this.gridx
				+ "\n" + "gridy=" + this.gridy 
				+ "\n" + "gridwith=" + this.gridwidth
				+ "\n" + "gridheight" + this.gridheight
				+ "\n" + "anchor=" + this.anchor
				+ "\n" + "fill=" + this.fill
				+ "\n" + "weightx=" + this.weightx
				+ "\n" + "weighty=" + this.weighty
				+ "\n" + "insets=" + this.insets.left +","+ this.insets.right +","+ this.insets.top +","+ this.insets.bottom
				+ "\n" + "ipad=" + this.ipadx +","+ this.ipady;
	}
	
}