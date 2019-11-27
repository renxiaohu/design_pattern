package design.structural_pattern.proxy_pattern.example2;

/**
 * @param
 * @author renxiaohu
 * @Title:
 * @Description:
 * @date 2019/11/27
 */
public class JiaShi implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("贾氏正在Happy中......");
    }

    @Override
    public void happyWithMan() {
        System.out.println("贾氏抛媚眼");
    }
}
