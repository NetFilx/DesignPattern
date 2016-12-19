package cn.limbo.design_patterns.flyweight;

import cn.limbo.design_patterns.flyweight.abstract_flyweight.AbstractChessmen;
import cn.limbo.design_patterns.flyweight.concrete_flyweight.ConcreteChessmen;

import java.util.Hashtable;

/**
 * 围棋棋子工厂类：享元工厂类，使用单例模式进行设计
 * Created by limbo on 2016/12/19.
 */
public class ChessmenFactory {

	private static ChessmenFactory INSTANCE = new ChessmenFactory();
	private Hashtable<String,AbstractChessmen> ht; //使用Hashtable来存储享元对象，充当享元池

	private ChessmenFactory() {
		ht = new Hashtable<>();
		AbstractChessmen black,white;
		black = new ConcreteChessmen("black");
		white = new ConcreteChessmen("white");
		ht.put("black",black);
		ht.put("white",white);
	}

	//返回享元工厂类的唯一实例
	public static ChessmenFactory getInstance(){
		return INSTANCE;
	}

	//通过key来获取存储在Hashtable中的享元对象
	public  AbstractChessmen getChessmen(String color){
		return this.ht.get(color);
	}
}
