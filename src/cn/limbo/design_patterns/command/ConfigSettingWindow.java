package cn.limbo.design_patterns.command;

import cn.limbo.utils.FileUtils;

import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 * 配置文件设置窗口类：请求发送者
 * Created by limbo on 2016/12/12.
 */
public class ConfigSettingWindow {

	//定义一个集合来存储每一次操作时的命令对象
	private ArrayList<Command> commands = new ArrayList<>();
	private Command command;

	//注入具体命令对象
	public void setCommand(Command command) {
		this.command = command;
	}

	//执行配置文件修改命令，同时将命令对象添加到命令集合中
	public void call(String args){
		command.execute(args);
		commands.add(command);
	}

	//记录请求日志，生成日志文件，将命令集合写入日志文件
	public void save(){
		FileUtils.writeCommands(commands);
	}

	//从日志文件中提取命令集合，并循环调用每一个命令对象的execute()方法来实现配置文件的重新设置
	public void recover(){
		ArrayList list ;
		list = FileUtils.readCommands();

		for(Object obj : list){
			((Command)obj).execute();
		}
	}
}
