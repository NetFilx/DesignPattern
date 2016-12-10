package cn.limbo.design_patterns.builder;

/**
 * 产品类建造者
 * 抽象类
 * Created by limbo on 2016/12/10.
 */
public abstract class PlayerBuilder {

	//方便子类进行访问
	protected Player player = new Player();

	//产品的基础的构件
	public abstract void buildMainWindow();

	public abstract void buildController();

	//产品的扩展构件
	//提供一个默认实现
	public void buildMenu() {
		this.player.setMenu(null);
	}


	public void buildPlayList() {
		this.player.setPlayList(null);
	}


	public void buildKeepList() {
		this.player.setKeepList(null);
	}


//	//进行细粒度的控制，决定是否存在相应的对象，一般用于扩展功能
//	//指挥者进行调用，决定是否建造。
//	//扩充的子类进行覆写，默认都是没有扩展功能的
//	public boolean hasMenu() {
//		return false;
//	}
//
//	public boolean hasPlayList() {
//		return false;
//	}
//
//	public boolean hasKeepList() {
//		return false;
//	}

	//创建并返回一个建造完成的对象
	public Player build() {

		//每个player都有的东西先建造
		this.buildMainWindow();
		this.buildController();

//		//如果有菜单则创建菜单
//		if(this.hasMenu()){
//			this.buildMenu();
//		}
//
//		if(this.hasPlayList()){
//			this.buildPlayList();
//		}
//
//		if(this.hasKeepList()){
//			this.buildKeepList();
//		}
		//产品的扩展功能
		this.buildMenu();
		this.buildPlayList();
		this.buildKeepList();

		return this.player;

	}

}
