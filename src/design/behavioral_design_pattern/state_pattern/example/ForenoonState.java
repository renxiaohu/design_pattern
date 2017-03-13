package design.behavioral_design_pattern.state_pattern.example;

/**
 * <p>上午工作状态</p>
 * Created by Administrator on 2017/3/1.
 */
public class ForenoonState extends State{
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 12){
            System.out.print("当前时间："+w.getHour()+"点 上午工作，精神百倍！！！\n");
        }else {
            w.setState(new NoonState());
            w.writeProgram();
        }
    }
}
