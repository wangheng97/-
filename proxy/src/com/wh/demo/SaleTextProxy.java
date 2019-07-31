package com.wh.demo;

/**
 * SaleTextProxy
 *
 * @author wangheng
 * @date 2019/7/31
 */
/**
 * 代理类
 * */
public class SaleTextProxy implements ISaleTecket{
    private ISaleTecket tecket;

    public SaleTextProxy(SaleTecket tecket) {
        this.tecket = tecket;
    }
    @Override
    public void sale(){
        System.out.println("欢迎光临");
        tecket.sale();
        System.out.println("请交5元手续费");
    }
}
