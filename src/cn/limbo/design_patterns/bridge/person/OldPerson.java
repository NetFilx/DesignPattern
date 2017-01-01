package cn.limbo.design_patterns.bridge.person;

/**
 * Created by limbo on 2016/12/5.
 */
public class OldPerson extends AbstractPerson {

	@Override
	public void doWrite() {

		System.out.println("人物名字: " + this.name + this.brush.doWrite());

	}
}
