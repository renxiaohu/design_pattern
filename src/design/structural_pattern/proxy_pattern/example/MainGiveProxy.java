package design.structural_pattern.proxy_pattern.example;

/**
 * <P>客户端测试</P>
 * Created by renxiaohu on 2016/12/2.
 */
public class MainGiveProxy {
    public static void main(String arges[]){
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("刘玉");

        Proxy proxy = new Proxy(schoolGirl);
        proxy.GiveDolls();
        proxy.GiveFlowers();
        proxy.GiveChocolate();

    }
}
