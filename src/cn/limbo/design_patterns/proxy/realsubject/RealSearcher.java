package cn.limbo.design_patterns.proxy.realsubject;

import cn.limbo.design_patterns.proxy.subject.Searcher;

/**
 * 真实主题类
 * Created by limbo on 2016/12/18.
 */
public class RealSearcher implements Searcher {
	@Override
	public String doSearch(String userId, String keyword) {
		return "查询结果：用户" + userId +"查询了" + keyword + "的相关信息";
	}
}
