package design.behavioral_design_pattern.chain_of_responsibility_pattern.example;

/**
 * 总经理类
 * Created by Administrator on 2017/3/9.
 */
public class GeneralManager extends Manager{
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假")){
            System.out.print(name + ":" + request.getRequestContent() + "数量"+request.getNumber()+"被批准！\n");
        }else if (request.getRequestType().equals("加薪") && request.getNumber() <=500){
            System.out.print(name + ":" + request.getRequestContent() + "数量"+request.getNumber()+"被批准！\n");
        }else if(request.getRequestType().equals("加薪") && request.getNumber() >500){
            System.out.print(name + ":" + request.getRequestContent() + "数量"+request.getNumber()+"再说吧！\n");
        }
    }
}
