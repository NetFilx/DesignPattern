package cn.limbo.design_patterns.builder.concrete_builder;

import cn.limbo.design_patterns.builder.PlayerBuilder;

/**
 * 精简模式
 * Created by limbo on 2016/12/10.
 */
public class SimplifyModeBuilder extends PlayerBuilder{


	@Override
	public void buildMainWindow() {
		this.player.setMainWindow("精简模式主窗口");
	}

	@Override
	public void buildController() {
		this.player.setController("精简模式控制条");
	}
}
