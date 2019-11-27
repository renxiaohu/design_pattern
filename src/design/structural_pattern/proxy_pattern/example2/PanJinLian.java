package design.structural_pattern.proxy_pattern.example2;

/**
 * @param
 * @author
 * @Title:
 * @Description:
 * @date 2019/11/27
 */
public class PanJinLian implements KindWomen {
    @Override
    public void makeEyesWithMan() {

        System.out.println("潘金莲抛媚眼");
    }

    @Override
    public void happyWithMan() {
        System.out.println("潘金莲在和男人做那个.....");
    }
}
