package cn.limbo.design_patterns.decorator.base_component;

import cn.limbo.design_patterns.decorator.Component;

/**
 * 基础的窗体类，实现了抽象的构件
 * Created by limbo on 2016/12/6.
 */
public class Window extends Component {
	@Override
	public void display() {
		System.out.println("显示窗体！");
	}
}
