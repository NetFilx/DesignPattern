package cn.limbo.design_patterns.bridge.person;

import cn.limbo.design_patterns.bridge.brush.AbstractBrush;

/**
 * 人的抽象类
 * Created by limbo on 2016/12/5.
 */
public abstract class AbstractPerson {

	protected String name; //名字

	//一般将该对象的可见性定义为protected，以便在其子类中访问Implementor的方法
	protected AbstractBrush brush; //所使用的毛笔

	public void setName(String name) {
		this.name = name;
	}

	public void setBrush(AbstractBrush brush) {
		this.brush = brush;
	}

	//具体的业务方法，由子类实现
	public abstract void doWrite();
}
