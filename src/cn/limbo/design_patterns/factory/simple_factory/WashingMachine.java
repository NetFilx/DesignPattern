package cn.limbo.design_patterns.factory.simple_factory;

/**
 * Created by limbo on 2016/12/7.
 */
public class WashingMachine implements ElectricalApplication{


	@Override
	public void create() {
		System.out.println("创建洗衣机");

	}
}
