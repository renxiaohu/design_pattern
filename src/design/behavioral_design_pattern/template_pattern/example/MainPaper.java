package design.behavioral_design_pattern.template_pattern.example;

/**
 * Created by Administrator on 2016/12/13.
 */
public class MainPaper {
    public static void main(String arges[]) {
        System.out.print("学生甲抄的试卷：");
        TestPaper studentA = new TestPaperA();
        studentA.TestQuestion1();
        studentA.TestQuestion2();
        studentA.TestQuestion3();
        System.out.print("\n");


        System.out.print("学生乙抄的试卷：");
        TestPaper studentB = new TestPaperB();
        studentA.TestQuestion1();
        studentA.TestQuestion2();
        studentA.TestQuestion3();
    }
}