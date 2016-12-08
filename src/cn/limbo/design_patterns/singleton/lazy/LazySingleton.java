package cn.limbo.design_patterns.singleton.lazy;

/**
 * 懒汉式单例模式
 * Created by limbo on 2016/12/8.
 */
public class LazySingleton {

	//防止编译器优化而忽略了
	private volatile static LazySingleton lazySingleton;

	private LazySingleton() {
	}

	//获取单例，但是是线程不安全的
	public static LazySingleton getInstance(){
		if(lazySingleton == null){
			lazySingleton = new LazySingleton();
			return lazySingleton;
		}else {
			return lazySingleton;
		}
	}


	//线程安全的单例模式，但是这样的效率不高
	public static synchronized LazySingleton getInstance2(){
		if(lazySingleton == null){
			lazySingleton = new LazySingleton();
			return lazySingleton;
		}else {
			return lazySingleton;
		}
	}

	//双重检验锁
	public static LazySingleton getInstance3(){
		if(lazySingleton == null){
			synchronized(LazySingleton.class){
				if(lazySingleton == null){
					lazySingleton = new LazySingleton();
				}
			}
		}
		return lazySingleton;
	}
}
