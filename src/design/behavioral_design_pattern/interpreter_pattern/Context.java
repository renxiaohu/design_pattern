package design.behavioral_design_pattern.interpreter_pattern;

/**
 * <p>包含解释器之外的全局信息</p>
 * Created by Administrator on 2017/3/12.
 */
public class Context {
    private String input;
    private String output;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
