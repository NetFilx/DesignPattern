package cn.limbo.design_patterns.composite.transparent_mode;

/**
 * 透明模式的部门类，也就是组合设计模式中的叶子节点
 * Created by limbo on 2016/12/2.
 */
public class TransparentDepartment extends TransparentMode {

    private String departmentName;

    public TransparentDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    //发送通知
    @Override
    public void infrom() {
        System.out.println(this.departmentName + "正在给员工发送通知...");
    }
}
