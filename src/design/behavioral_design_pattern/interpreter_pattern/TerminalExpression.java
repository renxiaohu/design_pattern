package design.behavioral_design_pattern.interpreter_pattern;

/**
 * <p>终结符表达式</p>
 * 实现与文法中的终结符相关联的解释操作
 * Created by Administrator on 2017/3/12.
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interprret(Context context) {
        System.out.print("终端解释器。\n");
    }
}
