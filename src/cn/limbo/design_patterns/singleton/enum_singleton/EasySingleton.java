package cn.limbo.design_patterns.singleton.enum_singleton;

/**
 * 枚举类型实现单例模式，这个是jdk1.5以上的版本才可以用的，也是开发者最推荐的
 * 实现方式，几乎解决了所有单例可能会遇到的问题，关键是书写简单。
 *
 * 调用方式，EasySingleton singleton = EasySingleton.INSTANCE
 * 然后singleton就可以调用EasySingleton里面的所有方法了，连构造方法什么的都不用写了
 * Created by limbo on 2016/12/8.
 */
public enum EasySingleton {

	INSTANCE;

	public void show(){
		System.out.println("枚举单例");
	}

}
