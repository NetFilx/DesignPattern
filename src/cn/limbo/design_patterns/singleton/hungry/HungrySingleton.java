package cn.limbo.design_patterns.singleton.hungry;

/**
 * 饿汉式，只要有需求就new一个出来
 * Created by limbo on 2016/12/7.
 */
public class HungrySingleton {

	private static final HungrySingleton hungrySingleton = new HungrySingleton();

	private HungrySingleton(){}

	public static HungrySingleton getInstance(){
		return hungrySingleton;
	}

}
