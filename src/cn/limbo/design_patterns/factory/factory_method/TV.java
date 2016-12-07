package cn.limbo.design_patterns.factory.factory_method;

/**
 * Created by limbo on 2016/12/7.
 */
public class TV implements ElectricalApplication {
	@Override
	public void create() {
		System.out.println("创建电视");
	}
}
