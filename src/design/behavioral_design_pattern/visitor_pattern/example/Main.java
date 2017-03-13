package design.behavioral_design_pattern.visitor_pattern.example;

/**
 * Created by Administrator on 2017/3/12.
 */
public class Main {
    public static void main(String arges[]){
        ObjectStructure o = new ObjectStructure();
        Man m = new Man();
        Woman wm = new Woman();
        m.setName("男人");
        wm.setName("女人");
        o.attach(m);
        o.attach(wm);

        //成功时的反应
        Success v1 = new Success();
        v1.setStatusName("成功");
        o.display(v1);

        //失败时的反应
        Failing v2 = new Failing();
        v2.setStatusName("失败");
        o.display(v2);

        //恋爱时的反应
        Amativeness v3 = new Amativeness();
        v3.setStatusName("恋爱");
        o.display(v3);
    }
}
