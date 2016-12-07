package cn.limbo.design_patterns.factory.abstract_factory;

/**
 * 品牌为海尔的工厂，当然工厂分类准则还可以是把电视电视分一起，
 * 分类方法因人而异，选择品牌只是更加合乎逻辑
 * Created by limbo on 2016/12/7.
 */
public class HairFactory implements AbstractFactory {

	@Override
	public TV createTV() {
		return new HairTV();
	}

	@Override
	public WashingMachine createFridge() {
		return new HairWashingMachine();
	}

	@Override
	public Fridge createWashingMachine() {
		return new HairFridge();
	}
}
