package design.structural_pattern.adapter_pattern.example;

/**
 *  后卫类
 * Created by Administrator on 2017/3/2.
 */
public class Guards extends Player{
    @Override
    public void attack() {
        System.out.print("后卫"+name+"进攻！！！！\n");
    }

    @Override
    public void defense() {
        System.out.print("后卫"+name+"防守！！！！\n");
    }

    public Guards(String name) {
        super(name);
    }
}
