package cn.limbo.design_patterns.command.concrete_command;

import cn.limbo.design_patterns.command.Command;

/**
 * 更新命令
 * Created by limbo on 2016/12/12.
 */
public class UpdateCommand extends Command {
	public UpdateCommand(String name) {
		super(name);
	}

	@Override
	public void execute(String args) {
		this.args = args;
		this.configOperator.update(args);
	}

	@Override
	public void execute() {
		this.configOperator.update(args);
	}
}
