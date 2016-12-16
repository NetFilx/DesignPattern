package cn.limbo.design_patterns.prototype;

import cn.limbo.design_patterns.prototype.abstract_prototype.Document;

import java.util.HashMap;

/**
 * 原型管理类，实际上就是一个单例工厂
 * Created by limbo on 2016/12/16.
 */
public enum PrototypeManager {

	INSTANCE;
	private HashMap<String, Document> maps = new HashMap<>();

	public void add(String key,Document document){
		this.maps.put(key,document);
	}

	public Document get(String key){
		return this.maps.get(key).clone();
	}

}
