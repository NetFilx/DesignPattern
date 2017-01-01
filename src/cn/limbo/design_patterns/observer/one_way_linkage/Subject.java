package cn.limbo.design_patterns.observer.one_way_linkage;

import java.util.ArrayList;

/**
 * 抽象目标类
 * Created by limbo on 2016/12/13.
 */
public abstract class Subject {

	protected String name;
	protected ArrayList<Observer> observers = new ArrayList<>();

	public Subject(String name) {
		this.name = name;
	}

	//添加
	public void attach (Observer observer) {
		System.out.println(observer.getName() + "买入这支股票");
		observers.add(observer);
	}

	//删除
	public void detach(Observer observer){
		System.out.println(observer.getName() + "抛出这支股票");
		observers.remove(observer);
	}

	//通知观察者
	public abstract void notifyObservers(String state);

}
