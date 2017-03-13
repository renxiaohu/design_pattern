package design.behavioral_design_pattern.chain_of_responsibility_pattern.example;

/**
 * 经理类
 * Created by Administrator on 2017/3/9.
 */
public class CommonManager extends Manager{
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <=2){
            System.out.print(name + ":" + request.getRequestContent() + "数量"+request.getNumber()+"被批准！\n");
        }else {
            if (superior !=null){
                superior.requestApplications(request);
            }
        }
    }
}
