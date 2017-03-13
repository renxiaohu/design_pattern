package design.creational_design_pattern.abstract_factory_pattern.example;

/**
 * <p>抽象工厂模式</p>
 * Created by Administrator on 2017/2/23.
 */
public interface IDepartment {

    void insert(Department department);

    Department getDepartment(int id);
}
