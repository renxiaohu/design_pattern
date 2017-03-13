package design.creational_design_pattern.singleton_pattern;

/**
 * Created by Administrator on 2017/3/8.
 */
public class Main {
    public static void main(String arges[]){
        SingletonTwoLock s1  = SingletonTwoLock.getInstance();
        SingletonTwoLock s2 =  SingletonTwoLock.getInstance();
        if (s1 == s2){
            System.out.print("两个对象是相同的实例\n");
            System.out.print("s1:"+s1.toString()+"\n"+"s2:"+s2.toString());

        }
    }
}
