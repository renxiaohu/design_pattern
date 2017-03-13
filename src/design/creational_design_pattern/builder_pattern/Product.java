package design.creational_design_pattern.builder_pattern;

import java.util.ArrayList;
import java.util.List;

/**<p>建造者模式</p>
 * Created by Administrator on 2016/12/15.
 */
public class Product {
    List<String> parts = new ArrayList<String>();

    //添加产品
    public void Add(String part){
        parts.add(part);
    }
    public void Show(){
        System.out.print("\n产品==创建！！！！！！！！！\n");
        for (String part : parts){
            System.out.print(part);
        }
    }
}
