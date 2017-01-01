package cn.limbo.design_patterns.command;

import java.io.Serializable;

/**
 * 配置文件操作类：请求接收者。
 * 由于ConfigOperator类的对象是Command的成员对象，
 * 它也将随Command对象一起写入文件，因此ConfigOperator也需要实现Serializable接口
 * Created by limbo on 2016/12/12.
 */
public class ConfigOperator implements Serializable {

	public void insert(String args) {
		System.out.println("insert nodes " + args);
	}

	public void update(String args) {
		System.out.println("update nodes " + args);
	}

	public void delete(String args) {
		System.out.println("delete nodes " + args);
	}

}
