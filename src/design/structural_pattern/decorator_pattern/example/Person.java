package design.structural_pattern.decorator_pattern.example;

/**
 * <p>穿衣展示</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class Person {
    public Person(){}

    private String name;

    public Person(String name){
        this.name=name;
    }
    public void show(){
        System.out.print("装扮的"+name);
    }
}
