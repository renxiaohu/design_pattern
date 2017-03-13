package design.creational_design_pattern.abstract_factory_pattern.example;

/**
 * <p>抽象工厂接口</p>
 *
 * 就不能不换DB吗？
 *
 * 定义一个创建访问各表对象的抽象的工厂接口
 * Created by Administrator on 2017/2/23.
 */
public interface IFactory {
    IUser createUser();

    IDepartment crateDepartment();
}
