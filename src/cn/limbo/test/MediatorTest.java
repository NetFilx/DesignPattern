package cn.limbo.test;

import cn.limbo.design_patterns.mediator.BaseClass;
import cn.limbo.design_patterns.mediator.Mediator;
import cn.limbo.design_patterns.mediator.concrete_baseclass.A;
import cn.limbo.design_patterns.mediator.concrete_baseclass.B;
import cn.limbo.design_patterns.mediator.concrete_baseclass.C;
import cn.limbo.design_patterns.mediator.concrete_mediator.NumberChangeMediator;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by limbo on 2016/12/14.
 */
public class MediatorTest {

	@Test
	public void show(){
		BaseClass a,b,c;
		a = new A(10);
		b = new B(10);
		c = new C(10);

		ArrayList<BaseClass> baseClasses = new ArrayList<>();
		baseClasses.add(a);
		baseClasses.add(b);
		baseClasses.add(c);
		Mediator mediator = new NumberChangeMediator();
		mediator.setLists(baseClasses);

		a.setMediator(mediator);
		b.setMediator(mediator);
		c.setMediator(mediator);

		c.update();
		a.update();
		b.update();
	}

}
