package cn.limbo.design_patterns.builder;

/**
 * 产品类
 * Created by limbo on 2016/12/10.
 */
public class Player {

	//实际上这些类型都是有实体类的，为了简单起见，全都使用了String类型
	private String menu; //菜单
	private String playList; //播放列表
	private String mainWindow; //主窗口
	private String controller; // 控制条
	private String keepList; // 收藏列表

	public Player() {
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getPlayList() {
		return playList;
	}

	public void setPlayList(String playList) {
		this.playList = playList;
	}

	public String getMainWindow() {
		return mainWindow;
	}

	public void setMainWindow(String mainWindow) {
		this.mainWindow = mainWindow;
	}

	public String getController() {
		return controller;
	}

	public void setController(String controller) {
		this.controller = controller;
	}

	public String getKeepList() {
		return keepList;
	}

	public void setKeepList(String keepList) {
		this.keepList = keepList;
	}

	@Override
	public String toString() {
		return "Player{" +
				"menu='" + menu + '\'' +
				", playList='" + playList + '\'' +
				", mainWindow='" + mainWindow + '\'' +
				", controller='" + controller + '\'' +
				", keepList='" + keepList + '\'' +
				'}';
	}
}
