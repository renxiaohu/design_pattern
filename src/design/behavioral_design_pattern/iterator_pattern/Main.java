package design.behavioral_design_pattern.iterator_pattern;

/**
 * Created by Administrator on 2017/3/7.
 */
public class Main {
    public static void main(String arges[]){
        Aggregate ag = new ConreteAggregate();
        ag.add("曾山");
        ag.add("刘玉");
        ag.add("陶双平");
        ag.add("李天奥");
        ag.add("熊永");
        //返回具体迭代器类
        Iterator it = ag.iterator();
        while (it.hasNext()){
            String str =(String) it.next();
            System.out.print(str+"请买车票！！！\n");
        }
    }
}
