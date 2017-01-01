package cn.limbo.design_patterns.factory.simple_factory;

/**
 * 简单工厂类，就不实现创建那么多实体的类了
 * 1.使用最基础的new方式来创建
 * 2.使用反射的方式实现，比之上面的方法更加灵活，耦合度更低，但是需要获取全类名，较为麻烦
 * 3.工厂类一般可以结合单例模式
 * Created by limbo on 2016/12/7.
 */
public class SimpleFactory {

	public static ElectricalApplication getElectricalApplication(String applicationName){

		switch (applicationName){
			case "TV":
				return new TV();
			case "Fridge":
				return new Fridge();
			case "WashingMachine":
				return new WashingMachine();
			default:
				return null;

		}

	}

	public static ElectricalApplication getElectricalApplicationUsingReflect(String fullName){

		ElectricalApplication application = null;
		try {
			Class aClass = Class.forName(fullName);
			application = (ElectricalApplication) aClass.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return application;
	}

}
