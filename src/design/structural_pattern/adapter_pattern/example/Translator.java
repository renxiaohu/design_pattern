package design.structural_pattern.adapter_pattern.example;

/**
 * 翻译者
 * Created by Administrator on 2017/3/2.
 */
public class Translator extends Player{

    private ForeignCenter wjzf = new ForeignCenter();
    public Translator(String name) {
        super(name);
        wjzf.setName(name);
    }

    @Override
    public void attack() {
        wjzf.zhongwenAttack();
    }

    @Override
    public void defense() {
        wjzf.zhongwenDefense();
    }
}
