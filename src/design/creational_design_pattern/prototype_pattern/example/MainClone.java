package design.creational_design_pattern.prototype_pattern.example;

/**
 * <p>客户端调用</p>
 * Created by renxiaohu on 2016/12/2.
 */
public class MainClone {

    public static void main(String arges[])throws CloneNotSupportedException{
        Resume a = new Resume("曾山");
        a.SetPersonalInfo("男","27");
        a.SetWorkExperience("2016-2017","申远---");


        Resume b = (Resume)a.Clone();
        a.SetPersonalInfo("男","26");
        b.SetWorkExperience("2015-2016","水晶石---");

        Resume c = (Resume)a.Clone();
        a.SetPersonalInfo("男","25");
        c.SetWorkExperience("2014-2015","金源堡---");


        a.Display();
        b.Display();
        c.Display();

    }

}
