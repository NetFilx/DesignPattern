package cn.limbo.design_patterns.composite.security_mode;

import java.util.ArrayList;

/**
 * 安全模式公司类
 * Created by limbo on 2016/12/2.
 */
public class SecurityCompany implements SecurityMode {

    private String companyName;

    //公司下属的分公司或者是部门
    private ArrayList<SecurityMode> departments = new ArrayList<>();

    public SecurityCompany(String companyName) {
        this.companyName = companyName;
    }


    //添加
    public void add(SecurityMode securityMode) {
        this.departments.add(securityMode);
    }

    //移除
    public void remove(SecurityMode securityMode) {
        this.departments.remove(securityMode);
    }

    //获取子元素
    public SecurityMode getChild(int i) {
        return this.departments.get(i);
    }

    //自定义通知行为，这里只是普通业务类的一个代表
    @Override
    public void inform() {
        System.out.println(this.companyName + "正在往下属部门分发通知...");
        for (SecurityMode tmp : this.departments) {
            tmp.inform();
        }
    }


}
