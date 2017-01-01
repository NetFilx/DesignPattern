package cn.limbo.design_patterns.responsibility_chain.concrete_approver;

import cn.limbo.design_patterns.responsibility_chain.Approver;
import cn.limbo.design_patterns.responsibility_chain.Leave;

/**
 * 总经理
 * Created by limbo on 2016/12/11.
 */
public class MainManager extends Approver {
	public MainManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Leave leave) {
		if (leave.getDays() <= 30) {
			System.out.println("总经理处理了" + leave.getName() + "的请假");
		}else {
			System.out.println("该请假不能受理");
		}
	}
}
