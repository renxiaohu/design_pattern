package design.structural_pattern.flyweight_pattern.example;

import design.structural_pattern.flyweight_pattern.ConcreteFlyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>外部状态与内部状态</p>
 * Created by Administrator on 2017/3/11.
 */
public class WebsiteFactory {

    private Map flyweights = new HashMap();
    //获得网站分类
    public WebSite getWebsiteCategory(String key){
        if (!flyweights.containsKey(key))
            flyweights.put(key,new ConcreteWebsite(key));
        return (WebSite) flyweights.get(key);
        //获得网站分类总数
    }
    public int getWebsiteCount(){
        return flyweights.size();
    }
}
