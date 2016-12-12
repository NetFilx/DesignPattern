package cn.limbo.test;

import cn.limbo.design_patterns.command.Command;
import cn.limbo.design_patterns.command.ConfigOperator;
import cn.limbo.design_patterns.command.ConfigSettingWindow;
import cn.limbo.design_patterns.command.concrete_command.DeleteCommand;
import cn.limbo.design_patterns.command.concrete_command.InsertCommand;
import cn.limbo.design_patterns.command.concrete_command.UpdateCommand;
import org.junit.Test;

/**
 * Created by limbo on 2016/12/12.
 */
public class CommandTest {

	@Test
	public void show(){

		ConfigSettingWindow csw = new ConfigSettingWindow();
		Command command;
		ConfigOperator co = new ConfigOperator();


		//三次对配置文件的更改
		command = new InsertCommand("add");
		command.setConfigOperator(co);
		csw.setCommand(command);
		csw.call("A");

		command = new UpdateCommand("update");
		command.setConfigOperator(co);
		csw.setCommand(command);
		csw.call("B");

		command = new DeleteCommand("delete");
		command.setConfigOperator(co);
		csw.setCommand(command);
		csw.call("C");

		System.out.println("----------------");
		System.out.println("saving...");
		csw.save();

		System.out.println("----------------");
		System.out.println("recovering...");
		csw.recover();
	}

}
