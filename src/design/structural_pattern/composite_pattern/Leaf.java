package design.structural_pattern.composite_pattern;

/**
 * <p>叶节点对象</p>
 * Created by Administrator on 2017/3/6.
 */
public class Leaf extends Component{
    @Override
    public void add(Component c) {
        System.out.print("Cannot add to a Leaf!\n");
    }

    @Override
    public void remove(Component c) {
        System.out.print("Cannot remove to a Leaf!\n");
    }

    @Override
    public void display(int depth){
        StringBuffer sb = new StringBuffer();
        for (int i = 0 ; i < depth ; i++){
            sb.append("-");
        }
        //叶节点的具体方法，此处是显示其名称和级别
        System.out.print(new String(sb) + name+"\n");
    }

    public Leaf(String name) {
        super(name);
    }
}
