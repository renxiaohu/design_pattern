package design.creational_design_pattern.abstract_factory_pattern.example;

/**
 * <p>客户端调用</p>
 * Created by Administrator on 2017/2/23.
 */
public class Main {

    public static void main (String arges []){

        User user = new User();
        Department department = new Department();

        //只需确定实例化哪一个数据库访问对象给 factory
        IFactory factory = new SqlserverFactory();
//        IFactory factory = new MysqlFactory();

        IUser iu = factory.createUser();
        iu.insert(user);
        iu.getUser(1);

        IDepartment id= factory.crateDepartment();
        id.insert(department);
        id.getDepartment(1);

    }
}
