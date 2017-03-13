package design.creational_design_pattern.abstract_factory_pattern.example;

/**
 * Created by Administrator on 2017/2/23.
 */
public class MysqlDepartment implements IDepartment{
    @Override
    public void insert(Department department) {
        System.out.print("在Mysql 中给 Department 表增加一条记录！！！\n");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.print("在Mysql 根据ID 得到 Department 表一条记录！！！\n");
        return null;
    }
}
