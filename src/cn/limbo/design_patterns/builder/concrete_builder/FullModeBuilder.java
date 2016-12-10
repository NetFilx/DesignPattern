package cn.limbo.design_patterns.builder.concrete_builder;

import cn.limbo.design_patterns.builder.PlayerBuilder;

/**
 * 完整模式
 * Created by limbo on 2016/12/10.
 */
public class FullModeBuilder extends PlayerBuilder {

	@Override
	public void buildMainWindow() {
		this.player.setMainWindow("完整模式主窗口");
	}

	@Override
	public void buildController() {
		this.player.setController("完整模式控制条");
	}

	@Override
	public void buildMenu() {
		this.player.setMenu("完整模式菜单");
	}

	@Override
	public void buildPlayList() {
		this.player.setPlayList("完整模式播放列表");
	}

	@Override
	public void buildKeepList() {
		this.player.setKeepList("完整模式收藏列表");
	}
}
