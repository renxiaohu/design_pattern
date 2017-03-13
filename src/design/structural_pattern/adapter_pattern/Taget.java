package design.structural_pattern.adapter_pattern;

/**
 * <p>适配器模式</p>
 * 客户端所期待的接口
 *  可为具体，抽象类和接口
 * Created by Administrator on 2017/3/1.
 */
public class Taget {

    public void request(){
        System.out.print("普通的请求！！！\n");
    }

}
