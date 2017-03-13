package design.behavioral_design_pattern.iterator_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>具体聚集类</p>
 * Created by Administrator on 2017/3/7.
 */
public class ConreteAggregate extends Aggregate{

    private List list = new ArrayList();

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void add(Object obj) {
        list.add(obj);
    }

    public Iterator iterator() {
        return new ConreteIterator(list);
//        return new ConreteIteratorDesc(list);
    }

    public void remove(Object obj) {
        list.remove(obj);
    }
}
