package cn.limbo.design_patterns.observer.two_way_linkage;

/**
 * 抽象观察者
 * Created by limbo on 2016/12/13.
 */
public interface Observer {

	//接收到通知之后的响应函数
	public void response(Message msg);
	public String getName();

}
