package design.structural_pattern.adapter_pattern;

/**
 * <p>适配器模式</p>
 *
 * 例 在NBA我需要翻译
 *
 *  适配类
 * 在内部包装一个Adaptee对象，把源接口转换成目标接口
 *
 *  使用一个已经存在的类，但如果它的接口，
 *  也就是你的方法和你的要求不同时，（双方都不太容易修改的时候）就应该考虑使用适配器模式
 *
 * Created by Administrator on 2017/3/1.
 */
public class Adapter extends Taget{

    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
