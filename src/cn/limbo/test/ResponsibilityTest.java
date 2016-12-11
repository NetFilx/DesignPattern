package cn.limbo.test;

import cn.limbo.design_patterns.responsibility_chain.Approver;
import cn.limbo.design_patterns.responsibility_chain.Leave;
import cn.limbo.design_patterns.responsibility_chain.concrete_approver.Director;
import cn.limbo.design_patterns.responsibility_chain.concrete_approver.MainManager;
import cn.limbo.design_patterns.responsibility_chain.concrete_approver.Manager;
import org.junit.Test;

/**
 * Created by limbo on 2016/12/11.
 */
public class ResponsibilityTest {

	@Test
	public void show(){

		Leave leave = new Leave("wyh",40);
		Approver director, manager,mainManager;
		director = new Director("主任");
		manager = new Manager("经理");
		mainManager = new MainManager("总经理");

		director.setSuccessor(manager);
		manager.setSuccessor(mainManager);

		director.handleRequest(leave);

	}

}
