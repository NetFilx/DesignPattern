package cn.limbo.utils;

import cn.limbo.design_patterns.command.Command;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by limbo on 2016/12/12.
 */
public class FileUtils {

	public static void writeCommands(ArrayList<Command> commands){

		try {
			File file = new File("config.log");
			if(!file.exists()){
				file.createNewFile();
			}
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream obj = new ObjectOutputStream(new BufferedOutputStream(fileOutputStream));
			obj.writeObject(commands);
			obj.close();
		} catch (Exception e) {
			System.out.println("write log occur error");
			e.printStackTrace();
		}

	}


	public static ArrayList readCommands(){
		File file = new File("config.log");
		if(!file.exists()){
			System.out.println("log file doesn't exists, please create it first!");
			return null;
		}
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream obj = new ObjectInputStream(new BufferedInputStream(fileInputStream));
			ArrayList commands = (ArrayList) obj.readObject();
			obj.close();
			return commands;
		} catch (Exception e) {
			System.out.println("command read fail！");
			e.printStackTrace();
		}
		return null;
	}

}
