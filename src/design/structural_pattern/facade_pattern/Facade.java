package design.structural_pattern.facade_pattern;

/**
 * <p>外观模式</p>
 *
 * 例 牛市股票还会亏钱？
 *
 * Created by Administrator on 2016/12/14.
 */
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public  Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }
    public void MethodA(){
        System.out.print("方法组A===========\n");
        one.MethedOne();
        two.MethedTwo();
        four.MethedFour();
    }
    public void MethodB(){
        System.out.print("方法组B===========\n");
        two.MethedTwo();
        three.MethedThree();
        four.MethedFour();
    }
}
