package design.creational_design_pattern.abstract_factory_pattern.example2;

import design.creational_design_pattern.abstract_factory_pattern.example.*;

/**
 * <p>用简单工厂来改进抽象工厂</p>
 * Created by Administrator on 2017/2/28.
 */
public class DataAccess {

    private static char db = 's';
//    private static char db = 'm';

    public static IUser createUser(){
        IUser result = null;
        switch (db){
            case 's':
                result = new SqlserverUser();
                break;
            case 'm':
                result = new MysqlUser();
                break;
        }
        return result;
    }
    public static IDepartment createDepartment(){
        IDepartment result = null;
        switch (db){
            case 's':
                result = new SqlserverDepartment();
                break;
            case 'm':
                result = new MysqlDepartment();
                break;
        }
        return result;
    }
}
