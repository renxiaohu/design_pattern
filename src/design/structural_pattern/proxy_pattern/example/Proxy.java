package design.structural_pattern.proxy_pattern.example;

/**
 * <p>追求者代理类</p>
 * 让代理 也去实现送礼物接口
 * Created by renxiaohu on 2016/12/2.
 */
public class Proxy extends IGiveGift{
    Pursult ps = null;
    public Proxy(SchoolGirl schoolGirl){
        ps = new Pursult(schoolGirl);
    }
    public void GiveDolls(){
        ps.GiveDolls();
    }
    public void GiveFlowers(){
        ps.GiveFlowers();
    }
    public void GiveChocolate(){
        ps.GiveChocolate();
    }
}
