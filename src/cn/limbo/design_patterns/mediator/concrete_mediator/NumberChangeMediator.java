package cn.limbo.design_patterns.mediator.concrete_mediator;

import cn.limbo.design_patterns.mediator.BaseClass;
import cn.limbo.design_patterns.mediator.Mediator;
import cn.limbo.design_patterns.mediator.concrete_baseclass.A;
import cn.limbo.design_patterns.mediator.concrete_baseclass.B;
import cn.limbo.design_patterns.mediator.concrete_baseclass.C;

import java.util.ArrayList;

/**
 * Created by limbo on 2016/12/14.
 */
public class NumberChangeMediator implements Mediator {

	private ArrayList<BaseClass> baseClasses = new ArrayList<>();
	private A a;
	private B b;
	private C c;


	@Override
	public void numberChange(BaseClass bc) {
		if (bc == a) {
			System.out.println("A : " + a.getNum());
			b.setNum(a.getNum() * 10);
			c.setNum((int) (Math.random() * b.getNum() + a.getNum()));
			System.out.println("B : " + b.getNum());
			System.out.println("C : " + c.getNum());
		} else if (bc == b) {
			System.out.println("B : " + b.getNum());
			a.setNum(b.getNum() / 10);
			c.setNum((int) (Math.random() * b.getNum() + a.getNum()));
			System.out.println("A : " + a.getNum());
			System.out.println("C : " + c.getNum());
		} else if (bc == c) {
			System.out.println("C : " + c.getNum());
			a.setNum(c.getNum() - 1);
			b.setNum(a.getNum() * 10);
			System.out.println("A : " + a.getNum());
			System.out.println("B : " + b.getNum());
		}
	}

	@Override
	public void setLists(ArrayList<BaseClass> objects) {
		this.baseClasses = objects;
		this.splice();
	}

	//将参数列表中的对象拆分出来
	private void splice() {
		for (BaseClass tmp : baseClasses) {
			if (tmp.getClass() == A.class) {
				this.a = (A) tmp;
			} else if (tmp.getClass() == B.class) {
				this.b = (B) tmp;
			} else if (tmp.getClass() == C.class) {
				this.c = (C) tmp;
			}
		}
	}
}
