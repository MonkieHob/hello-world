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
	 * @param gridx 左上角行位置
	 * @param gridy 左上角列位置
	 * @param gridwidth 所占行数
	 * @param gridheight 所占列数
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
	 * 对其方式
	 * GridBagConstraints.WEST/EAST/NORTH/SOUTH
	 */
	public Constraints setAnchor(int anchor)
	{
		this.anchor = anchor;
		return this;
	}
	
	/*
	 * 是否拉伸及拉伸方向  
	 * GridBagConstraints.NONE/HORIZONTAL/VERTICAL/BOTH
	 */
	public Constraints setFill(int fill)
	{
		this.fill = fill;
		return this;
	}
	
	/*
	 * x和y方向上的增量 
	 * 0  完全不拉伸
	 * 100 完全拉伸 
	 */
	public Constraints setWeight(double weightx, double weighty)
	{
		this.weightx = weightx;
		this.weighty = weighty;
		return this;
	}
	
	/*
	 * 外部填充
	 * 单位：像素 
	 */
	public Constraints setInsets(int distanceL, int distanceR, int distanceU, int distanceD)
	{
		this.insets = new Insets(distanceL, distanceR, distanceU, distanceD);
		return this;
	}
	
	/*
	 * 内部填充，设置最小大小
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