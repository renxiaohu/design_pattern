package design.behavioral_design_pattern.command_pattern;

/**
 * <p>接收者</p>
 * 知道如何实施与执行一个与请求相关的操作，任何类都可能作为一个接收者
 * Created by Administrator on 2017/3/9.
 */
public class Receiver {
    public void action(){
        System.out.print("执行请求！\n");
    }
}
