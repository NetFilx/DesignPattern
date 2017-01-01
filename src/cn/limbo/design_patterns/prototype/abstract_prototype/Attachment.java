package cn.limbo.design_patterns.prototype.abstract_prototype;

import java.io.Serializable;

/**
 * 抽象附件类
 * Created by limbo on 2016/12/16.
 */
public abstract class Attachment implements Serializable{

	private String name;
	private String type;

	public Attachment(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Attachment{" +
				"name='" + name + '\'' +
				", type='" + type + '\'' +
				'}';
	}

	public abstract void display();
}
