package cn.limbo.design_patterns.flyweight.abstract_flyweight;

import cn.limbo.design_patterns.flyweight.Coordinates;

/**
 * 抽象的棋子类
 * Created by limbo on 2016/12/19.
 */
public abstract class AbstractChessmen {

	protected String color;

	public AbstractChessmen(String color) {
		this.color = color;
	}

	public abstract void display(Coordinates coordinates);
}
