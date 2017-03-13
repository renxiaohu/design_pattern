package design.structural_pattern.flyweight_pattern;

/**
 * Created by Administrator on 2017/3/11.
 */
public class Main {
    public static void main(String arges[]){
        int extrinsicatate = 22;
        FlyweightFactory f = new FlyweightFactory();

        Flyweight fx = f.getFlyweight("X");
        fx.operationd(--extrinsicatate);

        Flyweight fy = f.getFlyweight("Y");
        fy.operationd(--extrinsicatate);

        Flyweight fz = f.getFlyweight("Z");
        fz.operationd(--extrinsicatate);

        Flyweight uf = new UnshareConcreteFlyweight();
        uf.operationd(--extrinsicatate);

    }
}
