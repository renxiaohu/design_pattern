package design.behavioral_design_pattern.strategy_pattern.example;

/**
 * <p>客户端调用选择收费模式</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class MainCash {
    double total = 0.0d;

    private void btnOK_Click(Object sender, Object eventArgs){
        CashContext csper = new CashContext('返');
        double totalPrices = 0.0d;
        totalPrices = csper.GetResult(500.5);
        total = total + totalPrices;
        System.out.print(total+"单价，数量，合计------------");
    }
    public static void main(String arges[]){
        double total = 0.0d;
        CashContext csper = new CashContext('返');
        double totalPrices = 0.0d;
        totalPrices = csper.GetResult(500.5);
        total = total + totalPrices;
        System.out.print(total+"单价，数量，合计------------");
    }
}
