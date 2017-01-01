package cn.limbo.design_patterns.factory.abstract_factory;

/**
 * Created by limbo on 2016/12/7.
 */
public class HairWashingMachine implements WashingMachine {
	@Override
	public void create() {
		System.out.println("创建海尔洗衣机");
	}
}
