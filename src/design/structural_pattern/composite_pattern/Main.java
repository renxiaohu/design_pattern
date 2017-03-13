package design.structural_pattern.composite_pattern;

/**
 * Created by Administrator on 2017/3/6.
 */
public class Main {

    public static void main(String arges[]){
        //生成树根root  根上长出两片叶 Leaf A 和 Leaf B
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        //根上长出分支 Composite X， 分支上有两叶 Leaf XA 和 Leaf XB
        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));

        root.add(comp);
        //在Composite X上再长出分支 Composite XX， 分支上有两叶 Leaf XXA 和 Leaf XXB
        Composite comp2 = new Composite("Composite XX");
        comp2.add(new Leaf("Leaf XXA"));
        comp2.add(new Leaf("Leaf XXB"));

        comp.add(comp2);

        //根部又长出2叶 Leaf C  和 Leaf C
        root.add(new Leaf("Leaf C"));
        Leaf leaf = new Leaf("Leaf C");
        root.add(leaf);
        root.remove(leaf);

        //显示大树的样子
        root.display(1);
    }
}
