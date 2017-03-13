package design.structural_pattern.composite_pattern.example;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>具体总公司类</p>
 * Created by Administrator on 2017/3/7.
 */
public class ConreteCompany extends Company{

    private List<Company> childrens = new ArrayList<Company>();
    public ConreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        childrens.add(c);
    }

    @Override
    public void remove(Company c) {
        childrens.remove(c);
    }

    @Override
    public void display(int depth) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0 ; i < depth ; i ++){
            sb.append("-");
        }
        System.out.print(new String(sb) + name+"\n");
        for (Company c : childrens){
            c.display(depth+2);
        }
    }

    //履行职责
    @Override
    public void lineOfDuty() {
        for (Company c : childrens){
            c.lineOfDuty();
        }
    }
}
