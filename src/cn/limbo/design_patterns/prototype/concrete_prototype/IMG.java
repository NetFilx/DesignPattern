package cn.limbo.design_patterns.prototype.concrete_prototype;

import cn.limbo.design_patterns.prototype.abstract_prototype.Attachment;

/**
 * Created by limbo on 2016/12/16.
 */
public class IMG extends Attachment{
	public IMG(String name, String type) {
		super(name, type);
	}

	@Override
	public void display() {
		System.out.println("IMG");
	}
}
