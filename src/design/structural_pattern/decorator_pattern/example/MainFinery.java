package design.structural_pattern.decorator_pattern.example;

/**
 * <p>装扮客户端调用</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class MainFinery {
    public static void main(String arges[]){
        Person ps = new Person("刘玉");

        System.out.print("第一种装扮：\n");
        Sneakers pqx = new Sneakers();
        BigTrouser kk = new BigTrouser();
        TShirts dtx = new TShirts();

        pqx.Decorate(ps);
        kk.Decorate(pqx);
        dtx.Decorate(kk);
        dtx.show();

        System.out.print("\n第二种装扮：\n");
        LeatherShoes qx = new LeatherShoes();
        Tie ld = new Tie();
        Suit xz = new Suit();

        qx.Decorate(ps);
        ld.Decorate(qx);
        xz.Decorate(ld);
        xz.show();
    }
}
