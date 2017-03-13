package design.structural_pattern.bridge_pattern.example;

/**
 * Created by Administrator on 2017/3/8.
 */
public class Main {
    public static void main(String arges[]){
        HandsetBrand ab = new HandsetBrandN();
        ab.setSoft(new HandsetGame());
        ab.run();
        ab.setSoft(new HandsetAdressList());
        ab.run();
        ab.setSoft(new HandsetMP3());
        ab.run();

        ab = new HandsetBrandM();
        ab.setSoft(new HandsetGame());
        ab.run();
        ab.setSoft(new HandsetAdressList());
        ab.run();
    }
}
