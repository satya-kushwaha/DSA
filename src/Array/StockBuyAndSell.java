package Array;


public class StockBuyAndSell {

    public static void main(String[] args) {
     int[] price={7,1,5,3,6,4};
     int bestBuy=price[0],bestSell=0;
     for (int i=0;i<price.length;i++){

          if( price[i] >= bestBuy){
              bestSell = Math.max(bestSell,price[i]-bestBuy);
          }
          bestBuy = Math.min(bestBuy,price[i]);
       }
        System.out.println(bestSell);
        return;
    }
}
