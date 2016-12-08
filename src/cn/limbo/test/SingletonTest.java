package cn.limbo.test;

import cn.limbo.design_patterns.singleton.enum_singleton.EasySingleton;
import cn.limbo.design_patterns.singleton.hungry.HungrySingleton;
import cn.limbo.design_patterns.singleton.lazy.LazySingleton;
import org.junit.Test;

/**
 * Created by limbo on 2016/12/8.
 */
public class SingletonTest {

	@Test
	public void lazyShow() {

		LazySingleton lazySingleton = LazySingleton.getInstance();
		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		LazySingleton lazySingleton2 = LazySingleton.getInstance();
		System.out.println(lazySingleton);
		System.out.println(lazySingleton1);
		System.out.println(lazySingleton2);

	}

	@Test
	public void hungryShow() {
		HungrySingleton hungrySingleton = HungrySingleton.getInstance();
		HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
		HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
		System.out.println(hungrySingleton);
		System.out.println(hungrySingleton1);
		System.out.println(hungrySingleton2);
	}

	@Test
	public void showEnum(){
		EasySingleton singleton = EasySingleton.INSTANCE;
		EasySingleton singleton1 = EasySingleton.INSTANCE;
		EasySingleton singleton2 = EasySingleton.INSTANCE;

		System.out.println(singleton == singleton1);
		System.out.println(singleton1 == singleton2);
		System.out.println(singleton2 == singleton );

		singleton.show();
	}

}
