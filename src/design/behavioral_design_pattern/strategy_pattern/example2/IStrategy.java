package design.behavioral_design_pattern.strategy_pattern.example2;

/**
 * 首先定一个策略接口，这是诸葛亮老人家给赵云的三个锦囊妙计的接口
 *
 * @param
 * @author renxiaohu
 * @Title:
 * @Description:
 * @date 2019/11/26
 */
public interface IStrategy {
    //每个锦囊妙计都是一个可执行的算法
    void operate();
}
