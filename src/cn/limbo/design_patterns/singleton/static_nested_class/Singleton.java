package cn.limbo.design_patterns.singleton.static_nested_class;

/**
 * 静态内部类实现方式
 * Created by limbo on 2016/12/8.
 */
public class Singleton {

	private Singleton(){}

	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();

	}

	public static Singleton getInstance(){
		return SingletonHolder.INSTANCE;
	}

}
