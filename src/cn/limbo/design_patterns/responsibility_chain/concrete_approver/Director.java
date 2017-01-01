package cn.limbo.design_patterns.responsibility_chain.concrete_approver;

import cn.limbo.design_patterns.responsibility_chain.Approver;
import cn.limbo.design_patterns.responsibility_chain.Leave;

/**
 * 主任
 * Created by limbo on 2016/12/11.
 */
public class Director extends Approver {


	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Leave leave) {
		if (leave.getDays() <= 3) {
			System.out.println("主任处理了" + leave.getName() + "的请假");
			return ;
		}
		this.successor.handleRequest(leave);
	}


}
