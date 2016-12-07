package cn.limbo.design_patterns.factory.abstract_factory;

/**
 * 抽象工厂
 * Created by limbo on 2016/12/7.
 */
public interface AbstractFactory {

	/**
	 * 这里本来应该把返回值修改成AbstractElectricalApplication的，
	 * 但是现实生活中这样的这对纯抽象编程实在是很困难，而且虽然TV，WashingMachine，Fridge
	 * 同属于家电类，但是其中的功能方法略有区别，这样使用纯粹的抽象就不行了，所以还是使用特定的类吧
	 */


	public TV createTV();
	public WashingMachine createFridge();
	public Fridge createWashingMachine();

}
