package cn.limbo.design_patterns.observer.concrete_subject;

import cn.limbo.design_patterns.observer.Observer;
import cn.limbo.design_patterns.observer.Subject;

/**
 * 具体目标类：股票类，实现了抽象目标类
 * Created by limbo on 2016/12/13.
 */
public class Stock extends Subject {
	public Stock(String name) {
		super(name);
	}

	@Override
	public void notifyObservers(String state) {
		for(Observer o : this.observers){
			o.doSomething(state);
		}
	}
}
