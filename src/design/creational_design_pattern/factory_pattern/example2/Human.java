package design.creational_design_pattern.factory_pattern.example2;

/**
 * <p>人类</p>
 * @param
 * @author renxiaohu
 * @Title:
 * @Description:
 * @date 2019/11/27
 */
public interface Human {
    //首先定义什么是人类
//人是愉快的，会笑的，本来是想用smile表示，想了一下laugh更合适，好长时间没有大笑了;
    void laugh();

    //人类还会哭，代表痛苦
    void cry();

    //人类会说话
    void talk();
}
