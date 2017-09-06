public class RationalNumber {
	private int numerator;
	private int denominator;
	
	public RationalNumber(int numerator, int denominator) {
		if (denominator == 0) { 
			throw new IllegalArgumentException;
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public RationalNumber() {
		this.numerator = 0;
		this.denominator = 1;
	}
	
	public boolean equals(Object o) {
		if(!(instanceof RationalNumber)) {
			throw new IllegalArgumentException
		}
		RationalNumber other = (RationalNumber) o;
		return (((double) this.numerator/this.denominator) - ( (double) 
				other.getNumerator() / other.getDenominator())) <= 0.000001;
	}
	
	public int getDenominator() {
		return this.denominator;
	}
	
	public int getNumerator() {
		return this.numerator;
	}
	
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}
	
		