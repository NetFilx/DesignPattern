package cn.limbo.design_patterns.command.concrete_command;

import cn.limbo.design_patterns.command.Command;

/**
 * 删除命令
 * Created by limbo on 2016/12/12.
 */
public class DeleteCommand extends Command {
	public DeleteCommand(String name) {
		super(name);
	}

	@Override
	public void execute(String args) {
		this.args = args;
		this.configOperator.delete(args);
	}

	@Override
	public void execute() {
		this.configOperator.delete(this.args);
	}
}
