package cn.limbo.design_patterns.command.concrete_command;

import cn.limbo.design_patterns.command.Command;

/**
 * 新增命令
 * Created by limbo on 2016/12/12.
 */
public class InsertCommand extends Command {
	public InsertCommand(String name) {
		super(name);
	}

	@Override
	public void execute(String args) {
		this.args = args;
		this.configOperator.insert(args);
	}

	@Override
	public void execute() {
		configOperator.insert(this.args);
	}
}
