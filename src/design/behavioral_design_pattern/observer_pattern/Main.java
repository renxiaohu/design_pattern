package design.behavioral_design_pattern.observer_pattern;

/**
 * <p>客户端</p>
 * Created by Administrator on 2017/2/23.
 */
public class Main {
    public static void main(String arges[]){
        ConcreteSubject subject = new ConcreteSubject();

        //具体通知者 添加具体主题
        subject.attach(new ConcreteObserver(subject,"x"));
        subject.attach(new ConcreteObserver(subject,"y"));
        subject.attach(new ConcreteObserver(subject,"z"));

        subject.setSubjectState("ABC");
        subject.notifyed();
    }
}
