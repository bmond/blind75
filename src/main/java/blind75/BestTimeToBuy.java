package blind75;

public class BestTimeToBuy {

	public static void main(String[] args) {
		int[] dayWiseShareValue = { 7, 2, 11, 1, 6, 8, 13 };
		int maxProfit = maxProfit(dayWiseShareValue);
		System.out.println(maxProfit);
	}

	private static int maxProfit(int[] dayWiseShareValue) {
		if (dayWiseShareValue.length == 1) {
			return 0;
		}
		int left = 0;
		int right;
		int maxProfit = 0;
		for (int i = 1; i <= dayWiseShareValue.length - 1; i++) {
			right = i;
			int profit = dayWiseShareValue[right] - dayWiseShareValue[left];
			if (profit > maxProfit) {
				maxProfit = profit;
			}
			if (profit < 0) {
				left = right;
			}
		}
		return maxProfit;
	}

}
