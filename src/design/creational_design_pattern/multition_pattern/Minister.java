package design.creational_design_pattern.multition_pattern;

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
    public static void main(String[] args) {
        int ministerNum = 10; //10个大臣
        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("第" + (i + 1) + "个大臣参拜的是:");
            emperor.emperorInfo();
        }
    }

}
