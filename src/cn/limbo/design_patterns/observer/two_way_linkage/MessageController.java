package cn.limbo.design_patterns.observer.two_way_linkage;

import java.util.ArrayList;

/**
 * 消息控制中心，用于接受消息和发送消息
 * 既是观察者也是观察目标
 * Created by limbo on 2016/12/13.
 */
public class MessageController extends Subject implements Observer {
	private ArrayList<Player> players;

	public MessageController(String name) {
		super(name);
		players = new ArrayList<>();
	}

	@Override
	public void attach(Observer observer) throws InvalidOptionException {
		System.out.println(observer.getName() + "加入游戏");
		this.players.add((Player) observer);
	}

	@Override
	public void detach(Observer observer) throws InvalidOptionException {
		System.out.println(observer.getName() + "退出游戏");
		this.players.remove(observer);
	}


	@Override
	public void notifyObserver(Message msg) {

		for(Player p : this.players){
			if(!p.getName().equals(msg.getPlayerNameBeingAttack())){
				p.response(msg);
			}
		}

	}

	//对玩家的求救信息作出反应
	@Override
	public void response(Message msg) {
		this.notifyObserver(msg);
	}
}
