package design.behavioral_design_pattern.template_pattern.example;

/**
 * <p>模板方法模式举例</p>
 * Created by Administrator on 2016/12/13.
 */
public abstract class TestPaper {
    public void TestQuestion1(){
        System.out.print("杨过得到，后来给了郭靖，练成倚天剑,屠龙刀的玄铁可能是【" +
                "" +"a：球磨铸铁"+
                "" +"b：马口铁"+
                "" +"c：高速合金钢"+
                "" +"d：碳素纤维"+
                "】");
        System.out.print("答案："+Answer1());
    }
    protected String Answer1(){
        return "";
    }
    public void TestQuestion2(){
        System.out.print("杨过，陈英，陆无双铲除了情花，造成【" +
                "" +"a：使这种植物不再害人"+
                "" +"b：是一种珍惜物种灭绝"+
                "" +"c：破坏了那个生态圈的生态平衡"+
                "" +"d：造成该地区沙漠化"+
                "】");
        System.out.print("答案："+Answer2());
    }
    protected String Answer2(){
        return "";
    }
    public void TestQuestion3(){
        System.out.print("蓝凤凰致使华山师徒呕吐不止，如果你是大夫，会开神马药给他们,【" +
                "" +"a：阿司匹林"+
                "" +"b：牛黄解毒片"+
                "" +"c：氟哌酸"+
                "" +"d：喝大量生牛奶"+
                "" +"e：以上都不对"+
                "】");
        System.out.print("答案："+Answer3());
    }
    protected String Answer3(){
        return "";
    }
}
