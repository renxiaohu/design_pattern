package design.creational_design_pattern.abstract_factory_pattern.example;

/**
 * Created by Administrator on 2017/2/23.
 */
public class MysqlUser implements IUser{
    @Override
    public void insert(User user) {
        System.out.print("在Mysql 中给 User 表增加一条记录！！！\n");
    }

    @Override
    public User getUser(int id) {
        System.out.print("在Mysql 根据ID 得到 User 表一条记录！！！\n");
        return null;
    }
}
