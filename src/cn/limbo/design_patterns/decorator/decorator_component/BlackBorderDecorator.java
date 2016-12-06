package cn.limbo.design_patterns.decorator.decorator_component;

import cn.limbo.design_patterns.decorator.Component;
import cn.limbo.design_patterns.decorator.ComponentDecorator;

/**
 * 黑色边框装饰类：具体装饰类
 * Created by limbo on 2016/12/6.
 */
public class BlackBorderDecorator extends ComponentDecorator {
	public BlackBorderDecorator(Component component) {
		super(component);
	}

	@Override
	public void display() {
		this.setBlackBorder();
		super.display();
	}

	public void setBlackBorder() {
		System.out.println("为构件增加黑色边框！");
	}
}
