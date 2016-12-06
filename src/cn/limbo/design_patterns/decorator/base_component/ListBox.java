package cn.limbo.design_patterns.decorator.base_component;

import cn.limbo.design_patterns.decorator.Component;

/**
 * 基础的列表框类，实现了抽象的构件
 * Created by limbo on 2016/12/6.
 */
public class ListBox extends Component {
	@Override
	public void display() {
		System.out.println("显示列表框！");
	}
}
