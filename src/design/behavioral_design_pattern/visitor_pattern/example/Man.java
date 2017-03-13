package design.behavioral_design_pattern.visitor_pattern.example;

/**
 * Created by Administrator on 2017/3/12.
 */
public class Man extends Person{
    @Override
    public void accept(Action visitor) {
        //首先在客户端程序将具体状态作为参数传递给“男人”类完成了一次分派
        //然后“男人类”调用作为作为参数的“具体状态”中的方法“男人反应”，
        //同时将自己（this）作为参数传递进去。这便完成了第二次分派
        visitor.getManConclusion(this);
    }
}
