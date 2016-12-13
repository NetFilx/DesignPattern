package cn.limbo.design_patterns.observer.one_way_linkage.concrete_observer;

import cn.limbo.design_patterns.observer.one_way_linkage.Observer;

/**
 * Created by limbo on 2016/12/13.
 */
public class Investor extends Observer {

	public Investor(String name) {
		super(name);
	}

	@Override
	public void doSomething(String state) {
		System.out.println(this.getName() + "发现股票正在" + state);
		if(state.equals("上涨")){
			System.out.println("他准备抛出");
		}else if(state.equals("下跌")){
			System.out.println("他准备买入");
		}
	}
}
