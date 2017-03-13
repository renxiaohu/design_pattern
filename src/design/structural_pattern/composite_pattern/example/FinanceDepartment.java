package design.structural_pattern.composite_pattern.example;

/**
 * <p>财务部</p>
 * Created by Administrator on 2017/3/7.
 */
public class FinanceDepartment extends Company{
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0 ; i < depth ; i ++){
            sb.append("-");
        }
        System.out.print(new String(sb) + name+"\n");
    }

    @Override
    public void lineOfDuty() {
        System.out.print("公司财务收支管理管理！！！"+name+"\n");
    }
}
