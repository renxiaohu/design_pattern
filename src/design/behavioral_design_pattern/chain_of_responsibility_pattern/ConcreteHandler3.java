package design.behavioral_design_pattern.chain_of_responsibility_pattern;

/**
 * Created by Administrator on 2017/3/9.
 */
public class ConcreteHandler3 extends  Handler{
    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30){
            System.out.print(this.toString()+"处理请求 ："+request+"\n");
        }else if (successor != null){
            successor.handleRequest(request);
        }
    }
}
