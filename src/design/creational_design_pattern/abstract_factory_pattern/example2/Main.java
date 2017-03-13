package design.creational_design_pattern.abstract_factory_pattern.example2;

import design.creational_design_pattern.abstract_factory_pattern.example.Department;
import design.creational_design_pattern.abstract_factory_pattern.example.IDepartment;
import design.creational_design_pattern.abstract_factory_pattern.example.IUser;
import design.creational_design_pattern.abstract_factory_pattern.example.User;

/**
 * Created by Administrator on 2017/2/28.
 */
public class Main {
    public static void main(String arges[]){

        User user = new User();
        Department dept = new Department();

        IUser iu = DataAccess.createUser();
        iu.insert(user);
        iu.getUser(1);

        IDepartment id = DataAccess.createDepartment();
        id.insert(dept);
        id.getDepartment(1);
    }
}
