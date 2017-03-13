package design.behavioral_design_pattern.state_pattern.example;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Main {

    public static void main(String arges[]){

        Work w = new Work();
        w.setHour(9);
        w.writeProgram();
        w.setHour(10);
        w.writeProgram();
        w.setHour(12);
        w.writeProgram();
        w.setHour(13);
        w.writeProgram();
        w.setHour(14);
        w.writeProgram();
        w.setHour(17);
        w.writeProgram();

//        w.setFinish(true);
        w.setFinish(false);

        w.setHour(19);
        w.writeProgram();
        w.setHour(22);
        w.writeProgram();
    }
}
