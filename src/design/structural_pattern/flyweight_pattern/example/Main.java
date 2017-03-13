package design.structural_pattern.flyweight_pattern.example;

/**
 * Created by Administrator on 2017/3/11.
 */
public class Main {
    public static void main(String arges[]){
        WebsiteFactory f = new WebsiteFactory();

        WebSite fx = f.getWebsiteCategory("产品展示");
        fx.use(new User("曾山"));

        WebSite fy = f.getWebsiteCategory("产品展示");
        fy.use(new User("刘玉"));

        WebSite fz = f.getWebsiteCategory("产品展示");
        fz.use(new User("陶双平"));

        WebSite fl = f.getWebsiteCategory("博客");
        fl.use(new User("李天奥"));

        WebSite fm = f.getWebsiteCategory("博客");
        fm.use(new User("王凡"));

        WebSite fn = f.getWebsiteCategory("博客");
        fn.use(new User("李天恩"));


        System.out.print("得到网站分类总数为："+f.getWebsiteCount());
    }
}
