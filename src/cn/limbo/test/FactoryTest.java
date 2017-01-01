package cn.limbo.test;

import cn.limbo.design_patterns.factory.abstract_factory.AbstractFactory;
import cn.limbo.design_patterns.factory.abstract_factory.HairFactory;
import cn.limbo.design_patterns.factory.factory_method.ElectricalApplication;
import cn.limbo.design_patterns.factory.factory_method.Factory;
import cn.limbo.design_patterns.factory.simple_factory.SimpleFactory;
import cn.limbo.utils.XMLUtils;
import org.junit.Test;

/**
 * Created by limbo on 2016/12/7.
 */
public class FactoryTest {

	@Test
	public void showSimpleFactory() {

		//基础调用方式
		SimpleFactory.getElectricalApplication("TV").create();

		//反射调用方式
		SimpleFactory.getElectricalApplicationUsingReflect("cn.limbo.design_patterns.factory.simple_factory.TV").create();

	}

	@Test
	public void showFactoryMethod() {

		Factory factory;
		factory = (Factory) XMLUtils.getBean("FactoryName");
		ElectricalApplication TV = factory.getElectricalApplication();
		TV.create();

	}

	@Test
	public void showAbstractFactory() {
		AbstractFactory factory = new HairFactory();
		factory.createFridge().create();
		factory.createTV().create();
		factory.createWashingMachine().create();
	}

}
