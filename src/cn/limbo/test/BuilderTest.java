package cn.limbo.test;

import cn.limbo.design_patterns.builder.Player;
import cn.limbo.design_patterns.builder.PlayerBuilder;
import cn.limbo.design_patterns.builder.concrete_builder.FullModeBuilder;
import cn.limbo.design_patterns.builder.concrete_builder.KeepModeBuilder;
import cn.limbo.design_patterns.builder.concrete_builder.SimplifyModeBuilder;
import org.junit.Test;

/**
 * Created by limbo on 2016/12/10.
 */
public class BuilderTest {

	@Test
	public void show(){

		PlayerBuilder playerBuilder = new KeepModeBuilder();
		Player player = playerBuilder.build();
		System.out.println(player);

	}

}
