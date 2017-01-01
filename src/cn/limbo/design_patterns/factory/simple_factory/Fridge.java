package cn.limbo.design_patterns.factory.simple_factory;

/**
 * Created by limbo on 2016/12/7.
 */
public class Fridge implements ElectricalApplication{


	@Override
	public void create() {
		System.out.println("创建冰箱");
	}
}
