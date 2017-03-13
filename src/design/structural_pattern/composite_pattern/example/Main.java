package design.structural_pattern.composite_pattern.example;

/**
 * Created by Administrator on 2017/3/7.
 */
public class Main {
    public static void main(String arges[]){

        ConreteCompany root = new ConreteCompany("北京总公司！");
        root.add(new HRDepartment("总公司人力资源部!"));
        root.add(new FinanceDepartment("总公司财务部！"));

        ConreteCompany comp = new ConreteCompany("上海华东分公司！");
        comp.add(new HRDepartment("上海华东分公司人力资源部!"));
        comp.add(new FinanceDepartment("上海华东分公司财务部！"));
        root.add(comp);

        ConreteCompany comp1 = new ConreteCompany("南京办事处！");
        comp1.add(new HRDepartment("南京办事处人力资源部!"));
        comp1.add(new FinanceDepartment("南京办事处财务部！"));
        comp.add(comp1);

        ConreteCompany comp2 = new ConreteCompany("杭州办事处！");
        comp2.add(new HRDepartment("杭州办事处人力资源部!"));
        comp2.add(new FinanceDepartment("杭州办事处财务部！"));
        comp.add(comp2);

        System.out.print("结构图:\n");
        root.display(1);

        System.out.print("职责:\n");
        root.lineOfDuty();
    }
}
