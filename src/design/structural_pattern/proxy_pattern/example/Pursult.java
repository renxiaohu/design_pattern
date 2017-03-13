package design.structural_pattern.proxy_pattern.example;

/**
 * <p>追求者</p>
 * Created by renxiaohu on 2016/12/2.
 */
public class Pursult extends IGiveGift{
    SchoolGirl schoolGirl= null;
    public  Pursult(SchoolGirl schoolGirl){
        this.schoolGirl=schoolGirl;
    }
    public void GiveDolls(){

        System.out.print(schoolGirl.getName()+"送你洋娃娃！----\n");
    }
    public void GiveFlowers(){
        System.out.print(schoolGirl.getName()+"送你鲜花！----\n");
    }
    public void GiveChocolate(){
        System.out.print(schoolGirl.getName()+"送你巧克力！----\n");
    }
}
