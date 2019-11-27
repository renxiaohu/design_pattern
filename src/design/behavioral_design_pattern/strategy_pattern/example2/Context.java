package design.behavioral_design_pattern.strategy_pattern.example2;

/**
 * <p>计谋有了，需要一个锦囊</p>
 * @param
 * @author renxiaohu
 * @Title:
 * @Description:
 * @date 2019/11/26
 */
public class Context {
    //构造函数，你要使用那个妙计
    private IStrategy straegy;

    public Context(IStrategy strategy) {
        this.straegy = strategy;
    }

    //使用计谋了，看我出招了
    public void operate() {
        this.straegy.operate();
    }
}
