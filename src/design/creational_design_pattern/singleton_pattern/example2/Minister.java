package design.creational_design_pattern.singleton_pattern.example2;

/**
 * @param
 * @author renxiaohu
 * @Title:
 * @Description:
 * @date 2019/11/27
 */
public class Minister {
    /**
     * @param args
     */
    public static void main(String[] args) { //第一天
        Emperor emperor1 = Emperor.getInstance();
        emperor1.emperorInfo(); //第一天见的皇帝叫什么名字呢?
        //第二天
        Emperor emperor2 = Emperor.getInstance();
        Emperor.emperorInfo();
        //第三天
        Emperor emperor3 = Emperor.getInstance();
        emperor2.emperorInfo();
        //三天见的皇帝都是同一个人，荣幸吧!
    }
}
