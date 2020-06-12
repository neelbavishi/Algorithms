package com.interview.random;


// Program to find best buying and selling days
public class StockBuySell {

	public int stockBuySell(int[] prices) {
        int buy=0;
        int sell=0;
        int profit=0;
        boolean buyDone = false;
        
        if(prices.length == 1) {
            return 0;
        }
        
        for(int i=0; i<prices.length; i++) {
            if(i<prices.length-1 && prices[i]<prices[i+1]  && !buyDone) {
                buy=prices[i];
                buyDone = true;
            } else if((i==prices.length-1 || prices[i]>prices[i+1]) && buyDone) {
                sell=prices[i];
                buyDone=false;
                profit = profit + (sell-buy);
            }
            
            
        }
        return profit;        
    }

	public static void main(String args[]) {
		StockBuySell stock = new StockBuySell();

		// stock prices on consecutive days
		int price[] = { 100, 180, 260, 310, 40, 535, 695 };
		// fucntion call
		System.out.println(stock.stockBuySell(price));
	}
}
