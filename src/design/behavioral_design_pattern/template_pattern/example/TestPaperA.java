package design.behavioral_design_pattern.template_pattern.example;

/**
 * Created by Administrator on 2016/12/13.
 */
public class TestPaperA extends TestPaper {
    @Override
    protected String Answer1(){
        return "b";
    }
    protected String Answer2(){
        return "a";
    }
    protected String Answer3(){
        return "e";
    }

}
