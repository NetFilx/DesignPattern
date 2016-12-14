package cn.limbo.design_patterns.observer.two_way_linkage;

/**
 * 求救消息类
 * Created by limbo on 2016/12/13.
 */
public class Message {

	private String playerNameBeingAttack; //正在遭受攻击的玩家
	private String content; //消息内容

	public Message(String playerNameBeingAttack, String content) {
		this.playerNameBeingAttack = playerNameBeingAttack;
		this.content = content;
	}

	public String getPlayerNameBeingAttack() {
		return playerNameBeingAttack;
	}

	public void setPlayerNameBeingAttack(String playerNameBeingAttack) {
		this.playerNameBeingAttack = playerNameBeingAttack;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
