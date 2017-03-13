package design.behavioral_design_pattern.chain_of_responsibility_pattern.example;

/**
 * Created by Administrator on 2017/3/9.
 */
public class Main {
    public static void main(String arges[]){
        CommonManager liuYu = new CommonManager("刘玉");
        Majordomo zengShan = new Majordomo("曾山");
        GeneralManager taoShuangPing = new GeneralManager("陶双平");

        liuYu.setSuperior(zengShan);
        zengShan.setSuperior(taoShuangPing);

        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("浅浅请假");
        request.setNumber(1);
        liuYu.requestApplications(request);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("浅浅请假");
        request2.setNumber(4);
        liuYu.requestApplications(request2);

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("浅浅加薪");
        request3.setNumber(500);
        liuYu.requestApplications(request3);

        Request request4 = new Request();
        request4.setRequestType("加薪");
        request4.setRequestContent("浅浅加薪");
        request4.setNumber(600);
        liuYu.requestApplications(request4);

    }
}
