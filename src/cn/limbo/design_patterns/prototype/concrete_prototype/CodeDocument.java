package cn.limbo.design_patterns.prototype.concrete_prototype;

import cn.limbo.design_patterns.prototype.abstract_prototype.Attachment;
import cn.limbo.design_patterns.prototype.abstract_prototype.Document;

import java.io.*;

/**
 * Created by limbo on 2016/12/16.
 */
public class CodeDocument implements Document {

	private Attachment attachment;

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	public Attachment getAttachment() {
		return attachment;
	}

	@Override
	public void display() {
		System.out.println("代码文档");
		System.out.println("添加了如下的附件：" + this.attachment);
	}

	//将对象写入到流中实现深度克隆
	@Override
	public Document clone() {

		try {
			ByteArrayOutputStream bao = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bao);
			oos.writeObject(this);


			ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bai);
			return (Document) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
