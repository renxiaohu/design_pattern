package design.behavioral_design_pattern.strategy_pattern.example2;

/**
 * <p>求吴国太开个绿灯</p>
 *
 * @param
 * @author renxiaohu
 * @Title:
 * @Description:
 * @date 2019/11/26
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行!");
    }
}
