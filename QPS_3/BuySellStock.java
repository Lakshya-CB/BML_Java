package QPS_3;

public class BuySellStock {
	public static void main(String[] args) {

	}

	public int maxProfit(int[] prices) {
		int Buy_Price = Integer.MAX_VALUE;
		int Max_Profit =0;
		for(int day=0;day<prices.length;day++) {
			int Curr_day_Profit = prices[day]- Buy_Price; 
			Max_Profit = Math.max(Curr_day_Profit, Max_Profit);
			
//			Update your Buy_Price
			Buy_Price = Math.min(Buy_Price, prices[day]);
			
		}
		return Max_Profit;
		
	}

}
