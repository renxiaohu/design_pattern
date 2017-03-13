package design.behavioral_design_pattern.chain_of_responsibility_pattern;

/**
 * Created by Administrator on 2017/3/9.
 */
public class Main {
    public static void main(String arges[]){
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int [] requests = {2,5,14,22,18,3,27,20};

        for (int i=0;i<requests.length;i++){
            h1.handleRequest(requests[i]);
        }

    }
}
