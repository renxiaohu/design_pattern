package design.behavioral_design_pattern.state_pattern.example;

/**
 * <p>下午工作状态</p>
 * Created by Administrator on 2017/3/1.
 */
public class AfternoonState extends State{
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 17){
            System.out.print("当前时间："+w.getHour()+"点 下午状态还不错，继续努力！！！\n");
        }else {
            w.setState(new EveningState());
            w.writeProgram();
        }
    }
}
