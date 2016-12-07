package cn.limbo.test;

import cn.limbo.design_patterns.factory.simple_factory.SimpleFactory;
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

	}

	@Test
	public void showAbstractFactory() {

	}

}
