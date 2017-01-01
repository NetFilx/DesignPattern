package cn.limbo.design_patterns.prototype.abstract_prototype;

import java.io.Serializable;

/**
 * 文档的接口
 * Created by limbo on 2016/12/16.
 */
public interface Document extends Serializable,Cloneable{
	public abstract void display();
	public abstract Document clone();

}
