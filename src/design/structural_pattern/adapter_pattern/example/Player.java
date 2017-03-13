package design.structural_pattern.adapter_pattern.example;

/**
 * 球员
 * Created by Administrator on 2017/3/1.
 */
public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    //进攻和防守的方法
    public abstract void attack();
    public abstract void defense();
}
