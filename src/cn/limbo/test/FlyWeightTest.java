package cn.limbo.test;

import cn.limbo.design_patterns.flyweight.ChessmenFactory;
import cn.limbo.design_patterns.flyweight.Coordinates;
import cn.limbo.design_patterns.flyweight.abstract_flyweight.AbstractChessmen;
import org.junit.Test;

/**
 * Created by limbo on 2016/12/19.
 */
public class FlyWeightTest {

	@Test
	public void show (){
		ChessmenFactory factory = ChessmenFactory.getInstance();
		AbstractChessmen black1,black2,black3,white1,white2 ;

		//通过享元工厂获取三颗黑子
		black1 = factory.getChessmen("black");
		black2 = factory.getChessmen("black");
		black3 = factory.getChessmen("black");

		//通过享元工厂获取两颗白子
		white1 = factory.getChessmen("white");
		white2 = factory.getChessmen("white");

		black1.display(new Coordinates(1,2));
		black1.display(new Coordinates(2,3));
		black1.display(new Coordinates(4,6));

		white1.display(new Coordinates(2,4));
		white2.display(new Coordinates(3,8));


		System.out.println(black1 == black2);
		System.out.println(black1 == black3);
		System.out.println(black1 == white1);
		System.out.println(white1 == white2);

	}

}
