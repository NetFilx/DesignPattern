package cn.limbo.design_patterns.composite.security_mode;

/**
 * Created by limbo on 2016/12/2.
 */
public class SecurityDepartment implements SecurityMode {

    private String departmentName;

    public SecurityDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public void inform() {
        System.out.println(this.departmentName + "正在给员工发送通知...");
    }
}
