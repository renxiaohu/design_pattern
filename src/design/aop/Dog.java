package design.aop;

/**
 * Created by renxiaohu on 2017/3/9.
 */
public class Dog implements Animal{
    @Override
    public void run() {
        System.out.print("小狗开始跑！\n");
    }

    @Override
    public void jump() {
        System.out.print("小狗开始跳！\n");
    }
}
