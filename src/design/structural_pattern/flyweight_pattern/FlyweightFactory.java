package design.structural_pattern.flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/11.
 */
public class FlyweightFactory {
    private Map flyweights = new HashMap();

    //初始化工厂时，先生成三个实例
    public FlyweightFactory() {
        flyweights.put("X",new ConcreteFlyweight());
        flyweights.put("Y",new ConcreteFlyweight());
        flyweights.put("Z",new ConcreteFlyweight());
    }
    //根据客户端的请求，获得已生成的实例
    public Flyweight getFlyweight(String key){
        return (Flyweight) flyweights.get(key);
    }
}
