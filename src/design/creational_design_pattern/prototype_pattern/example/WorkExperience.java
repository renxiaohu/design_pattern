package design.creational_design_pattern.prototype_pattern.example;

/**
 * <p>工作经历类</p>
 * Created by renxiaohu on 2016/12/2.
 */
public class WorkExperience implements Cloneable{
    private String timeArea;
    private String company;

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Object Clone()throws CloneNotSupportedException{
        return (Object) this.clone();
    }
}
