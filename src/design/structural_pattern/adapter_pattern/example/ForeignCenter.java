package design.structural_pattern.adapter_pattern.example;

/**
 * 外籍中锋
 * Created by Administrator on 2017/3/2.
 */
public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void zhongwenAttack(){
        System.out.print("外籍中锋"+name+"进攻！！！\n");
    }
    public void zhongwenDefense(){
        System.out.print("外籍中锋"+name+"防守！！！\n");
    }
}
