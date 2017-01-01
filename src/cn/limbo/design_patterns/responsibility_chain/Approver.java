package cn.limbo.design_patterns.responsibility_chain;

/**
 * 抽象类，审批者
 * Created by limbo on 2016/12/11.
 */
public abstract class Approver {

	protected Approver successor;
	protected String name;

	public Approver(String name) {
		this.name = name;
	}

	//设置后继者
	public void setSuccessor(Approver successor){
		this.successor = successor;
	}

	public abstract void handleRequest(Leave leave);
}
