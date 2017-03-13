package design.behavioral_design_pattern.state_pattern.example;

/**
 * <p>睡眠状态</p>
 * Created by Administrator on 2017/3/1.
 */
public class SleepingState extends State{
    @Override
    public void writeProgram(Work w) {
            System.out.print("当前时间："+w.getHour()+"点 不行了，睡着了！！！\n");

    }
}
