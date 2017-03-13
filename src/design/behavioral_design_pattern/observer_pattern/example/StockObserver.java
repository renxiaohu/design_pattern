package design.behavioral_design_pattern.observer_pattern.example;

/**
 * Created by Administrator on 2017/2/7.
 */
public class StockObserver extends Observer{
    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }
    public void update(){
        System.out.print(sub.getSubjectState()+name+"关闭股票行情，继续工作!!!!!!!!!!!!!\n");
    }
}
