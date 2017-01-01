package cn.limbo.design_patterns.builder.concrete_builder;

import cn.limbo.design_patterns.builder.PlayerBuilder;

/**
 * 收藏模式
 * Created by limbo on 2016/12/10.
 */
public class KeepModeBuilder extends PlayerBuilder {
	@Override
	public void buildMainWindow() {
		this.player.setMainWindow("收藏模式主窗口");
	}

	@Override
	public void buildController() {
		this.player.setController("收藏模式控制条");
	}

	@Override
	public void buildKeepList() {
		this.player.setKeepList("收藏模式收藏列表");
	}
}
