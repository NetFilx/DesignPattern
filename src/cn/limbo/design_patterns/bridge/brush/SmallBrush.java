package cn.limbo.design_patterns.bridge.brush;

/**
 * Created by limbo on 2016/12/5.
 */
public class SmallBrush extends AbstractBrush {

	@Override
	public String doWrite() {
		setSize("Small Brush");
		return "毛笔大小: " + this.size + this.color.doWrite();
	}

}
