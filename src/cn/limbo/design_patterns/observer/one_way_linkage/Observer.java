package cn.limbo.design_patterns.observer.one_way_linkage;

/**
 * 抽象观察者类
 * Created by limbo on 2016/12/13.
 */
public abstract class Observer {

	private String name;

	public Observer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//通知后的响应函数
	public abstract void doSomething(String state);

}
