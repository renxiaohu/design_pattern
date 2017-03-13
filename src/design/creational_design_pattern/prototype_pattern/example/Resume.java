package design.creational_design_pattern.prototype_pattern.example;

/**
 * <p>简历的原型模式实例</p>
 * Created by renxiaohu on 2016/12/2.
 */
public class Resume implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;

    public Resume(String name){
        this.name=name;
        workExperience = new WorkExperience();
    }

    //提供Clone方法调用的私有构造函数，以便克隆"工作经历的数据

    private Resume(WorkExperience workExperience)  throws  CloneNotSupportedException{
        this.workExperience = (WorkExperience)workExperience.Clone();
    }
    //设置个人信息
    public void SetPersonalInfo(String sex,String age){
        this.sex=sex;
        this.age=age;
    }
    //设置工作经历
    public void SetWorkExperience(String timeArea,String company){
        workExperience.setCompany(company);
        workExperience.setTimeArea(timeArea);
    }
    //显示
    public void Display(){
        System.out.print("姓名："+name+"! 性别："+sex+"! 年龄："+age+"\n");
        System.out.print("公司："+workExperience.getCompany()+"! 工作时间："+workExperience.getTimeArea()+"!\n");
    }

    public Object Clone() throws CloneNotSupportedException{
        Resume obj = new Resume(this.workExperience);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }
}
