package design.behavioral_design_pattern.observer_pattern;

/**
 * <p>具体主题或具体通知者</p>
 * Created by Administrator on 2017/2/23.
 */
public class ConcreteSubject extends Subject{

    private String subjectState;

    //具体被观察者状态

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
