package cn.limbo.design_patterns.decorator.decorator_component;

import cn.limbo.design_patterns.decorator.Component;
import cn.limbo.design_patterns.decorator.ComponentDecorator;

/**
 * 滚动条装饰类：具体装饰类
 * Created by limbo on 2016/12/6.
 */
public class ScrollBarDecorator extends ComponentDecorator {

	public ScrollBarDecorator(Component component) {
		super(component);
	}


	@Override
	public void display() {
		this.setScrollBar();
		super.display();
	}

	//装饰的方法
	//如果希望外部访问到装饰方法，则是半透明的装饰模式，否则为透明的装饰模式，通常建议将装饰方法设置为透明的方式，符合里氏替换原则
	private void setScrollBar(){
		System.out.println("为构件增加滚动条！");
	}
}
