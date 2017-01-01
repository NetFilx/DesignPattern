package cn.limbo.test;

import cn.limbo.design_patterns.decorator.Component;
import cn.limbo.design_patterns.decorator.base_component.Window;
import cn.limbo.design_patterns.decorator.decorator_component.BlackBorderDecorator;
import cn.limbo.design_patterns.decorator.decorator_component.ScrollBarDecorator;
import org.junit.Test;

/**
 * Created by limbo on 2016/12/6.
 */
public class DecoratorTest {

	@Test
	public void show(){

		Component window , scrollerBarWindow, blackBorderDecorator;//使用抽象构件定义

		window = new Window(); //定义基础构件，待装饰的类
		scrollerBarWindow = new ScrollBarDecorator(window); //定义装饰后的构件
		blackBorderDecorator = new BlackBorderDecorator(window);

//		scrollerBarWindow.display();
		blackBorderDecorator.display();
	}

}
