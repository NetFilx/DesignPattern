package cn.limbo.test;

import cn.limbo.design_patterns.composite.security_mode.SecurityCompany;
import cn.limbo.design_patterns.composite.security_mode.SecurityDepartment;
import cn.limbo.design_patterns.composite.transparent_mode.TransparentCompany;
import cn.limbo.design_patterns.composite.transparent_mode.TransparentDepartment;
import cn.limbo.design_patterns.composite.transparent_mode.TransparentMode;
import org.junit.Test;

/**
 * 组合模式测试类
 * Created by limbo on 2016/12/2.
 */
public class CompositeTest {

    @Test
    public void show(){

//        transparentModeTest();
        securityModeTest();

    }

    private static void transparentModeTest(){
        TransparentMode mainCompany = new TransparentCompany("总公司");
        TransparentMode subCompany_0 = new TransparentCompany("子公司-0");
        TransparentMode subCompany_1 = new TransparentCompany("子公司-1");

        TransparentMode department_0 = new TransparentDepartment("A部门");
        TransparentMode department_1 = new TransparentDepartment("B部门");
        TransparentMode department_2 = new TransparentDepartment("C部门");
        TransparentMode department_3 = new TransparentDepartment("D部门");
        TransparentMode department_4 = new TransparentDepartment("E部门");

        mainCompany.add(subCompany_0);
        mainCompany.add(subCompany_1);

        subCompany_0.add(department_0);
        subCompany_0.add(department_1);
        subCompany_1.add(department_2);
        subCompany_1.add(department_3);
        subCompany_1.add(department_4);

        mainCompany.infrom();
    }

    private static void securityModeTest(){
        SecurityCompany mainCompany = new SecurityCompany("总公司");
        SecurityCompany subCompany_0 = new SecurityCompany("子公司-0");
        SecurityCompany subCompany_1 = new SecurityCompany("子公司-1");

        SecurityDepartment department_0 = new SecurityDepartment("A部门");
        SecurityDepartment department_1 = new SecurityDepartment("B部门");
        SecurityDepartment department_2 = new SecurityDepartment("C部门");
        SecurityDepartment department_3 = new SecurityDepartment("D部门");
        SecurityDepartment department_4 = new SecurityDepartment("E部门");

        mainCompany.add(subCompany_0);
        mainCompany.add(subCompany_1);

        subCompany_0.add(department_0);
        subCompany_0.add(department_1);
        subCompany_1.add(department_2);
        subCompany_1.add(department_3);
        subCompany_1.add(department_4);

        mainCompany.inform();
    }

}
