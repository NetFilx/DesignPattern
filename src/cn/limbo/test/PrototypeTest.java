package cn.limbo.test;

import cn.limbo.design_patterns.prototype.PrototypeManager;
import cn.limbo.design_patterns.prototype.abstract_prototype.Attachment;
import cn.limbo.design_patterns.prototype.abstract_prototype.Document;
import cn.limbo.design_patterns.prototype.concrete_prototype.CodeDocument;
import cn.limbo.design_patterns.prototype.concrete_prototype.IMG;
import cn.limbo.design_patterns.prototype.concrete_prototype.ResearchDocument;
import cn.limbo.design_patterns.prototype.concrete_prototype.ZIP;
import org.junit.Test;

/**
 * Created by limbo on 2016/12/16.
 */
public class PrototypeTest {

	@Test
	public void show(){

		Attachment img ,zip;
		img = new IMG("img","img");
		zip = new ZIP("zip","zip");

		CodeDocument code = new CodeDocument();
		ResearchDocument research = new ResearchDocument();

		code.setAttachment(zip);
		research.setAttachment(img);

		PrototypeManager p = PrototypeManager.INSTANCE;

		p.add("research",research);
		p.add("code",code);

		CodeDocument code1 = (CodeDocument) p.get("code");
		ResearchDocument research1 = (ResearchDocument) p.get("research");

		code.display();
		research.display();

		System.out.println(code.getAttachment() == code1.getAttachment());
		System.out.println(research.getAttachment() == research1.getAttachment());
	}

}
