package cn.limbo.design_patterns.proxy.proxy;

import cn.limbo.design_patterns.proxy.realsubject.RealSearcher;
import cn.limbo.design_patterns.proxy.subject.Searcher;

/**
 * 代理类
 * Created by limbo on 2016/12/18.
 */
public class ProxySearcher implements Searcher {

	private Searcher searcher = new RealSearcher();
	private Validator validator = new Validator();
	private Logger logger = new Logger();

	@Override
	public String doSearch(String userId, String keyword) {
		if(this.validator.validate(userId)){
			String result = this.searcher.doSearch(userId,keyword);
			this.logger.log(userId,keyword);
			return result;
		}
		else{
			return "你没有权限查询";
		}
	}

	private class Validator {
		boolean validate(String userId) {
			return userId.equals("wyh");
		}
	}

	private class Logger {
		void log(String userId, String keyword) {
			System.out.println(userId + "检索" + keyword);
		}
	}
}
