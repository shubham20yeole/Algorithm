
public class arbitrage {
	public static void main(String[] args) {
		//		double a= 1.1837;
		//		double b= 1.3829;
		//		double c= 0.6102;
		double a= 1.1234;
		double b= 1.2134;
		double c= 1.2311;
		String[] quotes = {"1.1234 1.2134 1.2311", "1.1837 1.3829 0.6102", "0.5795 0.5173 1.2223"};
		//		int[] result = arbitage(a,b,c);
		int[] result = arbitrage(quotes);
		for(int i=0; i<result.length; i++){
			System.out.println(result[i]);
		}
	}

	private static int[] arbitage(double a, double b, double c) {
		int[] result = new int[2];
		double price = 100000;
		double result2 = price - price*a*b*c;
		for(int i=0;i<result.length;i++){
			if(result2<0){
				result[i] = 0;
			}else{
				result[i] = (int)result2;
			}
		}
		return result;
	}
	static int[] arbitrage(String[] quotes) {
		int[] result = new int[quotes.length];
		for(int i=0; i<quotes.length; i++){
			String[] splitStr = quotes[i].split("\\s+");
			double a = Double.parseDouble(splitStr[0]);
			double b = Double.parseDouble(splitStr[1]);
			double c = Double.parseDouble(splitStr[2]);
			double usd = 100000;
			double euros = usd/a; //Euros
			double GBP = euros/b; //GBP
			usd = GBP/c;
			double result2 = euros + GBP + usd;
			int netProfit = (int)usd-100000;
			if(netProfit<0){
				result[i] = 0;
			}else{
				result[i] = netProfit;
			}
		}
		return result;
	}
}
