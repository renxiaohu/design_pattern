package design.creational_design_pattern.abstract_factory_pattern.example;

/**
 * Created by Administrator on 2017/2/23.
 */
public class MysqlFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new MysqlUser();
    }

    @Override
    public IDepartment crateDepartment() {
        return new MysqlDepartment();
    }
}
