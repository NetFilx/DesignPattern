package cn.limbo.design_patterns.singleton.enum_singleton;

/**
 * Created by limbo on 2016/12/8.
 */
public enum EasySingleton {

	INSTANCE;

	public void show(){
		System.out.println("枚举单例");
	}

}
