package cn.limbo.design_patterns.observer.two_way_linkage;

/**
 * 如果目标无法访问该方法，抛出一个自定义的异常
 * Created by limbo on 2016/12/13.
 */
public class InvalidOptionException extends Exception {

	public InvalidOptionException(String message) {
		super(message);
	}
}
