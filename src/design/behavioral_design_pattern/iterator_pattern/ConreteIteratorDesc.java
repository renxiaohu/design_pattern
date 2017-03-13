package design.behavioral_design_pattern.iterator_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>具体迭代器类</p>
 * Created by Administrator on 2017/3/7.
 */
public class ConreteIteratorDesc extends Iterator{
    private List list = new ArrayList();
    private int cursor;

    public int getCursor() {
        return cursor;
    }

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }

    public ConreteIteratorDesc(List list){
        this.list = list;
    }
    public boolean hasNext() {
        if(cursor==0){
            return false;
        }
        return true;
    }

    public Object next() {
        Object obj = null;
        if(this.hasNext()){
            obj = this.list.get(cursor--);
        }
        return obj;
    }
}
