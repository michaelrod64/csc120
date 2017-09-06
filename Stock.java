public class Stock {
	private String symbol;
	private int totalShares;
	private double totalCost;
	
	public Stock(String theSymbol) {
		if (theSymbol == null) {
			throw new NullPointerException("null symbol");
		}
			symbol = theSymbol;
			totalShares = 0;
			totalCost = 0.00;
			
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public int getShares() {
		return totalShares;
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	
	public void clear() {
		totalShares = 0
		totalCost = 0.00;
	}
	
	public String toString() {
		return symbol + "(" + totalShares + " shares, $" + totalCost + " total cost");
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof Stock)) {
			throw new IllegalArgumentException
		}
		return (this.symbol.equals(o.getSymbol()) && this.totalShares == o.getShares()
				&& this.totalCost == o.getTotalCost())
	}
	
	public double getProfit(double currentPrice) {
		if (currentPrice < 0.0) {
			throw new IllegalArgumentException("negative current price");
		}
		
		double marketValue = totalShares * currentPrice;
		return marketValue - totalCost;
	}
	
	public void purchase(int shares, double pricePerShare) {
		if (shares < 0 || pricePerShare < 0.0) {
			throw new IllegalArgumentException ("negative shares or price");
		}
		
		totalShares += shares;
		totalCost += shares * pricePerShare;
	}
}