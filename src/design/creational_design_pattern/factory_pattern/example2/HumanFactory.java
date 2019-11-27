package design.creational_design_pattern.factory_pattern.example2;

/**
 * @param
 * @author renxiaohu
 * @Title:
 * @Description:
 * @date 2019/11/27
 */
public class HumanFactory {
    //定一个烤箱，泥巴塞进去，人就出来，这个太先进了
    public static Human createHuman(Class c) {

        Human human = null; //定义一个类型的人类
        try {
            human = (Human) Class.forName(c.getName()).newInstance(); //产生一个
        } catch (InstantiationException e) {//你要是不说个人种颜色的话，没法烤，要白的 黑，你说话了才好烤
            System.out.println("必须指定人种的颜色");
        } catch (IllegalAccessException e) { //定义的人种有问题，那就烤不出来了，这是...
            System.out.println("人种定义错误!");
        } catch (ClassNotFoundException e) { //你随便说个人种，我到哪里给你制造去?!
            System.out.println("混蛋，你指定的人种找不到!");
        }
        return human;
    }
}
