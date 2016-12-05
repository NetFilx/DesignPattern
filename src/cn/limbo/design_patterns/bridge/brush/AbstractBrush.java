package cn.limbo.design_patterns.bridge.brush;

import cn.limbo.design_patterns.bridge.color.Color;

/**
 * 毛笔的抽象类
 * Created by limbo on 2016/12/5.
 */
public abstract class AbstractBrush {

	protected String size; //毛笔型号
	//一般将该对象的可见性定义为protected，以便在其子类中访问Implementor的方法

	protected Color color; //毛笔可以写出的颜色，一种毛笔只能写出一种颜色

	public void setSize(String size) {
		this.size = size;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	//具体的业务方法，由子类实现
	public abstract String doWrite();

}
