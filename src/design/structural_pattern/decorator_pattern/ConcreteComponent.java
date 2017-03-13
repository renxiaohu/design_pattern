package design.structural_pattern.decorator_pattern;

/**
 * <p>定义一个具体的对象，也可以给这个对象添加一些职责</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class ConcreteComponent extends Component{
    @Override
    public void Operation(){
        System.out.print("具体对象的操作!----------------------\n");
    }
}
