package design.structural_pattern.facade_pattern.example;

/**
 * Created by Administrator on 2016/12/14.
 */
public class MainFund {
    public static void main(String arges[]){
        Fund fund = new Fund();
        fund.BuyFund();
        fund.SellFund();
    }
}
