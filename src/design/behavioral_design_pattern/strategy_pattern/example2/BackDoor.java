package design.behavioral_design_pattern.strategy_pattern.example2;

/**
 * <p>找乔国老帮忙，使孙权不能杀刘备</p>
 *
 * @param
 * @author renxiaohu
 * @Title:
 * @Description:
 * @date 2019/11/26
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
