package cn.limbo.test;

import cn.limbo.design_patterns.observer.Observer;
import cn.limbo.design_patterns.observer.Subject;
import cn.limbo.design_patterns.observer.concrete_observer.Investor;
import cn.limbo.design_patterns.observer.concrete_subject.Stock;
import org.junit.Test;

/**
 * Created by limbo on 2016/12/13.
 */
public class ObserverTest {


	@Test
	public void show() {

		Subject stock1 = new Stock("A股");
		Observer o1, o2, o3;
		o1 = new Investor("张三");
		o2 = new Investor("李四");
		o3 = new Investor("王五");

		stock1.attach(o1);
		stock1.attach(o2);
		stock1.attach(o3);

		stock1.notifyObservers("上涨");

	}

}
