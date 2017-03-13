package design.structural_pattern.bridge_pattern.example;

/**
 * 桥接模式
 * <p>手机品牌抽象类</p>
 * Created by Administrator on 2017/3/8.
 */
public abstract class HandsetBrand {
    protected HandsetSoft soft;

    public void setSoft(HandsetSoft soft) {
        this.soft = soft;
    }
    //运行
    public abstract void run();
}
