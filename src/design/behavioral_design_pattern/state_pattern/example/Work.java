package design.behavioral_design_pattern.state_pattern.example;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Work {

    private State current;

    private double hour;

    private boolean finish = false;


    public Work() {
        current = new ForenoonState();
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void setState(State s){
        current = s;
    }

    public void writeProgram(){
        current.writeProgram(this);
    }
}
