package design.behavioral_design_pattern.state_pattern.example;

/**
 * <p>晚上工作状态</p>
 * Created by Administrator on 2017/3/1.
 */
public class EveningState extends State{
    @Override
    public void writeProgram(Work w) {
        if (w.isFinish()){
            w.setState(new RestState());
            w.writeProgram();

        }else {
            if(w.getHour() < 21){
                System.out.print("当前时间："+w.getHour()+"点 加班，疲惫至极！！！\n");
            }else {
                w.setState(new SleepingState());
                w.writeProgram();
            }

        }
    }
}
