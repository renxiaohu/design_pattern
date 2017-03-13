package design.behavioral_design_pattern.interpreter_pattern;

/**
 *
 * <p>解释器模式</p>
 *
 * 例 正则表达式 各浏览器——其实你不懂老板的心
 *
 *  当有一个语音需要解释执行，
 *  并且你可将该语音中的句子表示为一个抽象的语法树时，可使用解释器模式
 *
 * 抽象表达式
 * Created by Administrator on 2017/3/12.
 */
public abstract class AbstractExpression {
    //声明一个抽象的表达式操作，这个接口为抽象语法树中所有的节点所共享
    public abstract void interprret(Context context);
}
