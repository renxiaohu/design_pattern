package design.structural_pattern.adapter_pattern;

/**
 * 客户端代码
 * Created by Administrator on 2017/3/1.
 */
public class Main {
    public static void main(String arges[]){
        Taget taget = new Adapter();
        taget.request();
    }
}
