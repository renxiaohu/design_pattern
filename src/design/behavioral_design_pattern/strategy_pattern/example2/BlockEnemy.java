package design.behavioral_design_pattern.strategy_pattern.example2;

/**
 * <p>孙夫人断后，挡住追兵</p>
 *
 * @param
 * @author renxiaohu
 * @Title:
 * @Description:
 * @date 2019/11/26
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
