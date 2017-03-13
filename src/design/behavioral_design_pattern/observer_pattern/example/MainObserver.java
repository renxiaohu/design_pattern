package design.behavioral_design_pattern.observer_pattern.example;

/**
 * Created by Administrator on 2017/2/7.
 */
public class MainObserver {
    public static void main(String arges[]){

        Boss huhansan = new Boss();

        StockObserver tongshi1 = new StockObserver("曾山",huhansan);
        StockObserver tongshi2 = new StockObserver("刘玉",huhansan);

        huhansan.attach(tongshi1);
        huhansan.attach(tongshi2);

        huhansan.detach(tongshi2);

        huhansan.setSubjectState("我胡汉三回来了！！！");
        huhansan.notifyObserver();
    }
}
