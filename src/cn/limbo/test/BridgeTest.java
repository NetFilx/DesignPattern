package cn.limbo.test;

import cn.limbo.design_patterns.bridge.brush.AbstractBrush;
import cn.limbo.design_patterns.bridge.brush.LargeBrush;
import cn.limbo.design_patterns.bridge.color.Color;
import cn.limbo.design_patterns.bridge.color.Red;
import cn.limbo.design_patterns.bridge.person.AbstractPerson;
import cn.limbo.design_patterns.bridge.person.OldPerson;
import cn.limbo.design_patterns.bridge.person.YoungPerson;
import org.junit.Test;

/**
 * Created by limbo on 2016/12/5.
 */
public class BridgeTest {

	@Test
	public void show(){
		AbstractPerson youngPerson = new YoungPerson();
		AbstractPerson oldPerson = new OldPerson();
		AbstractBrush largeBrush = new LargeBrush();
		Color red = new Red();

		largeBrush.setColor(red);
		youngPerson.setName("Young Jack");
		oldPerson.setName("Old Jack");
		youngPerson.setBrush(largeBrush);
		oldPerson.setBrush(largeBrush);

		youngPerson.doWrite();
		oldPerson.doWrite();

	}

}
