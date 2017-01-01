package cn.limbo.design_patterns.mediator.concrete_baseclass;

import cn.limbo.design_patterns.mediator.BaseClass;

/**
 * Created by limbo on 2016/12/14.
 */
public class C extends BaseClass {
	public C(int num) {
		super(num);
	}

	@Override
	public void update() {
		this.num += 10;
		changed();
	}
}
