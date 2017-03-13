package design.structural_pattern.facade_pattern.example;

/**
 * 外观模式举例外观类
 * Created by Administrator on 2016/12/14.
 */
//基金
public class Fund {
    Stock1 gu1;
    Stock2 gu2;
    Stock3 gu3;
    NationalDebt1 gz1;
    Realty1 fdc1;
    public Fund(){
        gu1 = new Stock1();
        gu2 = new Stock2();
        gu3 = new Stock3();
        gz1 = new NationalDebt1();
        fdc1 = new Realty1();
    }
    public void BuyFund(){
        gu1.Buy();
        gu2.Buy();
        gu3.Buy();
        gz1.Buy();
        fdc1.Buy();
    }
    public void SellFund(){
        gu1.Sell();
        gu2.Sell();
        gu3.Sell();
        gz1.Sell();
        fdc1.Sell();
    }
}
