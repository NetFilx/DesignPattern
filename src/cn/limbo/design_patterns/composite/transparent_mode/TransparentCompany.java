package cn.limbo.design_patterns.composite.transparent_mode;

import java.util.ArrayList;

/**
 * 透明模式的公司类，用作基础容器进行使用
 * Created by limbo on 2016/12/2.
 */
public class TransparentCompany extends TransparentMode {

    private String companyName;

    //用于存储TransparentMode对象
    private ArrayList<TransparentMode> departments = new ArrayList<>();

    public TransparentCompany(String companyName) {
        this.companyName = companyName;
    }

    //修改缺省方法实现
    @Override
    public void add(TransparentMode transparentMode) {
        this.departments.add(transparentMode);
    }

    @Override
    public void remove(TransparentMode transparentMode) {
        this.departments.remove(transparentMode);
    }

    @Override
    public TransparentMode getChild(int i) {
        return this.departments.get(i);
    }

    //自定义通知行为，这里只是普通业务类的一个代表
    @Override
    public void infrom() {
        System.out.println(this.companyName + "正在往下属部门分发通知...");

        for (TransparentMode tmp : this.departments) {
            tmp.infrom();
        }
    }
}
