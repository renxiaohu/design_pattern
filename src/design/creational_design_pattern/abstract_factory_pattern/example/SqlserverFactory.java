package design.creational_design_pattern.abstract_factory_pattern.example;

/**
 * Created by Administrator on 2017/2/23.
 */
public class SqlserverFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment crateDepartment() {
        return new SqlserverDepartment();
    }
}
