package design.behavioral_design_pattern.iterator_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>具体迭代器类</p>
 * Created by Administrator on 2017/3/7.
 */
public class ConreteIterator extends Iterator{
    private List list = new ArrayList();
    private int cursor =0;
    public ConreteIterator(List list){
        this.list = list;
    }
    public boolean hasNext() {
        if(cursor==list.size()){
            return false;
        }
        return true;
    }
    public Object next() {
        Object obj = null;
        if(this.hasNext()){
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}
