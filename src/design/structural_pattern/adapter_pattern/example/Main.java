package design.structural_pattern.adapter_pattern.example;

/**
 * Created by Administrator on 2017/3/2.
 */
public class Main {
    public static void main(String arges[]){
        Player b = new Forwards("巴蒂尔");
        b.attack();
        Player m = new Guards("麦克格雷迪");
        m.attack();
        Player ym = new Translator("姚明");
        ym.attack();
        ym.defense();
    }
}
