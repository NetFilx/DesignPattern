package cn.limbo.design_patterns.responsibility_chain;

/**
 * Created by limbo on 2016/12/11.
 */
public class Leave {

	private String name; //申请请假人的名字
	private int days; //请假天数

	public Leave(String name, int days) {
		this.name = name;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "Leave{" +
				"name='" + name + '\'' +
				", days=" + days +
				'}';
	}
}
