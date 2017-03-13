package design.behavioral_design_pattern.state_pattern.example;

/**
 * <p>休息状态</p>
 * Created by Administrator on 2017/3/1.
 */
public class RestState extends State{
    @Override
    public void writeProgram(Work w) {
        System.out.print("当前时间："+w.getHour()+"点 下班回家了！！！\n");
    }
}
