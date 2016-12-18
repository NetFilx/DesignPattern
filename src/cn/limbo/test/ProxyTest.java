package cn.limbo.test;

import cn.limbo.design_patterns.proxy.proxy.ProxySearcher;
import org.junit.Test;

/**
 * Created by limbo on 2016/12/18.
 */
public class ProxyTest {

	@Test
	public void show(){
		ProxySearcher proxySearcher = new ProxySearcher();
		System.out.println(proxySearcher.doSearch("wyh","ghy"));
	}

}
