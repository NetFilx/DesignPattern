package cn.limbo.design_patterns.mediator;

/**
 * 基础类
 * Created by limbo on 2016/12/14.
 */
public abstract class BaseClass {

	protected int num;
	protected Mediator mediator;

	public BaseClass() {
	}

	public BaseClass(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void changed(){
		this.mediator.numberChange(this);
	}

	//更新数据
	public abstract void update();
}
