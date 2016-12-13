package cn.limbo.design_patterns.observer.two_way_linkage;

import java.util.ArrayList;

/**
 * 抽象观察对象
 * Created by limbo on 2016/12/13.
 */
public abstract class Subject {

	protected String name;

	public Subject(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//添加观察者
	public abstract void attach(Observer observer) throws InvalidOptionException;
	//删除观察者
	public abstract void detach(Observer observer) throws InvalidOptionException;
	//通知观察者
	public abstract void notifyObserver(Message msg);
}
