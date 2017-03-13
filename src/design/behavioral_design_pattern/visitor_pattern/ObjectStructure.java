package design.behavioral_design_pattern.visitor_pattern;

import java.util.ArrayList;
import java.util.List;

/** ObjectStructure 类，能枚举它的元素，
 * 可以提供一个高层的接口以允许访问者访问它的元素
 * Created by Administrator on 2017/3/12.
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<Element>();
    public void attach(Element element){
        elements.add(element);
    }
    public void detach(Element element){
        elements.remove(element);
    }
    public void accept(Visitor visitor){
        for (Element e : elements){
            e.accept(visitor);
        }
    }
}
