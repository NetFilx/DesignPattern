package cn.limbo.design_patterns.command;

import java.io.Serializable;

/**
 * 抽象命令类，由于需要将命令对象写入文件，因此它实现了Serializable接口
 * Created by limbo on 2016/12/12.
 */
public abstract class Command implements Serializable {

	protected String name;  //命令名称
	protected String args;  //命令参数
	protected ConfigOperator configOperator; //维持对接收者对象的引用

	public Command(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setConfigOperator(ConfigOperator configOperator) {
		this.configOperator = configOperator;
	}

	public abstract void execute(String args);
	public abstract void execute();

}
