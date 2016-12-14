package cn.limbo.design_patterns.mediator;

import java.util.ArrayList;

/**
 * Created by limbo on 2016/12/14.
 */
public  interface Mediator {

	public void numberChange(BaseClass bc);
	public void setLists(ArrayList<BaseClass> objects);
}
