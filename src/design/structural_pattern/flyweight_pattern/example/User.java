package design.structural_pattern.flyweight_pattern.example;

/**
 * <p>用户类，用于网站的客户在账号，是“网站”类的外部状态</p>
 * Created by Administrator on 2017/3/11.
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
