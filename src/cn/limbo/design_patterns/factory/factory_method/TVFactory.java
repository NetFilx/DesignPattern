package cn.limbo.design_patterns.factory.factory_method;

/**
 * 可以创建生产特定类的工厂，Spring中的FactoryBean就是使用这个模式
 * Created by limbo on 2016/12/7.
 */
public class TVFactory implements Factory {
	@Override
	public ElectricalApplication getElectricalApplication() {

		return new TV();

	}
}
