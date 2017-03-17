package com.ccjjltx.exception.custom;

/**
 * Created by ccjjltx on 2017/3/17.
 * 在实际应用中往往需要跟复杂的处理方式--当一个异常出现时，单靠某个方法无法完全处理该异常，必须由几个方法协作才可完全处理该
 * 异常。也就是说，在异常出现的当前方法中，程序只对异常进行部分处理，还有些处理需要在该方法的调用者中才能完成，所以应该抛出
 * 异常，让该方法的调用者也能捕获到异常
 * @author ccj
 * @version 1.0
 */
public class AuctionTest {
    private double initPrice=30.0;
    //因为该方法中显式抛出了AuctionException异常
    //所以此处需要声明抛出AuctionException异常
    public void bid(String bidPrice) throws AuctionException{
        double d=0.0;
        try{
            d=Double.parseDouble(bidPrice);
        }catch (Exception e){
            //此处完成本方法中可以对异常执行修复处理
            //此处仅是在控制台打印异常的跟踪
            e.printStackTrace();
            //再次抛出自定义异常
            throw new AuctionException("竞拍价必须是数值,不能包含其他字符!");
            /*
            catch块捕获到异常后，系统打印了异常的跟踪栈信息，接着抛出一个AuctionException异常，通知该方法的调用者再次处理该
            AuctionException异常。所以程序中main方法，也就是bid()方法调用者还可以再次捕获AuctionException异常，并将该异常的
            详细描述信息输出到标准错误输出

             */
        }
        if(initPrice>d){
            throw new AuctionException("竞拍价比起拍价低,不允许竞拍");
        }
        initPrice=d;
    }
    public static void main(String[] args){
        AuctionTest at=new AuctionTest();
        try{
            at.bid("df");
        }catch(AuctionException ae){
            //再次捕获到bid()方法,并对该异常进行处理
            System.out.println(ae.getMessage());
        }
    }
}
