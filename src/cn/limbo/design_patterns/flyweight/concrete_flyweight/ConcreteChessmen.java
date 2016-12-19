package cn.limbo.design_patterns.flyweight.concrete_flyweight;

import cn.limbo.design_patterns.flyweight.Coordinates;
import cn.limbo.design_patterns.flyweight.abstract_flyweight.AbstractChessmen;

/**
 * Created by limbo on 2016/12/19.
 */
public class ConcreteChessmen extends AbstractChessmen {
	public ConcreteChessmen(String color) {
		super(color);
	}

	@Override
	public void display(Coordinates coordinates) {
		System.out.println("棋子颜色：" + this.color + " 棋子坐标：( " + coordinates.getX() + ", " + coordinates.getY() + " )");
	}
}
