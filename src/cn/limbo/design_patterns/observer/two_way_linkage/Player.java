package cn.limbo.design_patterns.observer.two_way_linkage;

/**
 * 玩家
 * 可以发布求救信息也可以实施救援
 * 既是观察者也是观察对象
 * Created by limbo on 2016/12/13.
 */
public class Player extends Subject implements Observer{

	private MessageController mc;

	public Player(String name,MessageController mc) {
		super(name);
		this.mc = mc;
	}

	@Override
	public void attach(Observer observer) throws InvalidOptionException {
		throw new InvalidOptionException("没有该方法");
	}

	@Override
	public void detach(Observer observer) throws InvalidOptionException {
		throw new InvalidOptionException("没有该方法");
	}

	//盟友受到攻击，作出回应
	@Override
	public void response(Message msg) {
		System.out.println(this.name + "收到" + msg.getPlayerNameBeingAttack() + "的求救消息");
		System.out.println(this.name + "马上前去支援");
	}


	//自己受到攻击，向通知中心发送求助信息
	@Override
	public void notifyObserver(Message msg) {
		System.out.println(this.name + " : "+msg.getContent());
		this.mc.response(msg);
	}

	//广播求救信息
	public void broadcast(){
		Message msg = new Message(this.name,"遭受攻击");
		this.notifyObserver(msg);
	}
}
