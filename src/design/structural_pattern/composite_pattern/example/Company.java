package design.structural_pattern.composite_pattern.example;

/**
 * <p>公司类 抽象类或接口</p>
 * Created by Administrator on 2017/3/7.
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }
    public abstract void add(Company c);
    public abstract void remove(Company c);
    public abstract void display(int depth);
    //履行职责
    public abstract void lineOfDuty();
}
