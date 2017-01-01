package cn.limbo.test;

import cn.limbo.design_patterns.observer.one_way_linkage.Observer;
import cn.limbo.design_patterns.observer.one_way_linkage.Subject;
import cn.limbo.design_patterns.observer.one_way_linkage.concrete_observer.Investor;
import cn.limbo.design_patterns.observer.one_way_linkage.concrete_subject.Stock;
import cn.limbo.design_patterns.observer.two_way_linkage.InvalidOptionException;
import cn.limbo.design_patterns.observer.two_way_linkage.Message;
import cn.limbo.design_patterns.observer.two_way_linkage.MessageController;
import cn.limbo.design_patterns.observer.two_way_linkage.Player;
import org.junit.Test;

/**
 * Created by limbo on 2016/12/13.
 */
public class ObserverTest {


	@Test
	public void oneWayLinkage() {

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

	@Test
	public void twoWayLinkage(){

		MessageController mc = new MessageController("通知中心");
		Player p1,p2,p3;
		p1 = new Player("A",mc);
		p2 = new Player("B",mc);
		p3 = new Player("C",mc);

		try {
			mc.attach(p1);
			mc.attach(p2);
			mc.attach(p3);
		} catch (InvalidOptionException e) {
			e.printStackTrace();
		}

		//广播求救
		p1.broadcast();
	}

}
