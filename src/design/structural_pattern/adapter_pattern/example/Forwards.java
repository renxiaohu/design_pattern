package design.structural_pattern.adapter_pattern.example;

/**
 *  前锋类
 * Created by Administrator on 2017/3/2.
 */
public class Forwards extends Player{
    @Override
    public void attack() {
        System.out.print("前锋"+name+"进攻！！！！\n");
    }

    @Override
    public void defense() {
        System.out.print("前锋"+name+"防守！！！！\n");
    }

    public Forwards(String name) {
        super(name);
    }
}
