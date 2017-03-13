package design.structural_pattern.composite_pattern;

import java.util.ArrayList;
import java.util.List;

/**<p>组合模式</p>
 *
 * 例 分公司 = 一个部门
 *
 * Created by Administrator on 2017/3/6.
 */
public class Composite extends Component{

    private List<Component> childrens = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        childrens.add(c);
    }

    @Override
    public void remove(Component c) {

        childrens.remove(c);
    }

    @Override
    public void display(int depth) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0 ; i < depth ; i++){
            sb.append("-");
        }
        //叶节点的具体方法，此处是显示其名称和级别
        System.out.print(new String(sb) + name+"\n");
        for (Component component : childrens){
            component.display(depth+2);
        }
    }

}
