package cn.limbo.design_patterns.bridge.color;

/**
 * Created by limbo on 2016/12/5.
 */
public class Red implements Color{
	@Override
	public String doWrite() {
		return "书写颜色:红色";
	}
}
