package design.structural_pattern.facade_pattern;

/**
 * <p>外观模式代码</p>
 * Created by Administrator on 2016/12/14.
 */
public class MainFacade {
    public static void main(String arges[]){
        Facade facade = new Facade();

        facade.MethodA();
        facade.MethodB();

    }


}
