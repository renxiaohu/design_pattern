package design.behavioral_design_pattern.state_pattern.example;

/**
 * <p>中午工作状态</p>
 * Created by Administrator on 2017/3/1.
 */
public class NoonState extends State{
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 13){
            System.out.print("当前时间："+w.getHour()+"点 饿了，午饭；犯困，午休！！！\n");
        }else {
            w.setState(new AfternoonState());
            w.writeProgram();
        }
    }
}
