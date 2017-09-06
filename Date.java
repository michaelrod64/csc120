public class Date {
	private int year;
	private int month;
	private int day;
	
	public Date(int year, int month, int day) {
		if (month == 0 || month < 0 || day < 0) {
			throw new IllegalArgumentException
		}	
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void addDays(int plusDays) {
		for (int i = 0; i < plusDays; i++) {
			
			if (this.day + 1 > 28 && this.month == 2) {
				this.day = 1;
				this.month++;
			}
			else if ((this.day + 1 > 30) && (this.month == 4 || 6 || 9 || 11) {
				this.day = 1;
				this.month++;
			}
			else if ((this.day + 1 > 31) && (this.month == 1 || 3 || 5 || 7 || 8 || 10)) {	
				this.day = 1;
				this.month++;
			}
			else if((this.day + 1 > 31) && (this.month == 12)) {
				this.day = 1;
				this.month = 1;
				this.year++;
			}
			else {
				this.day++;
			}
		}
	}
	
	public void addWeeks(int weeks) {
		this.addDays(7 * weeks);
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof Date)) {
			return false;
		}
		Date other = (Date) o;
		return ((other.getYear() == this.year) && (other.getMonth() == this.month) 
				&& (other.getDay() == this.day));
	}		
	
	public int daysTo(Date other) {
		int tempDay;
		int tempMonth;
		int tempYear;
		int tempDay2;
		int tempMonth2;
		int tempYear2;
	
		if (this.year != other.getYear()) {
			if (this.year > other.getYear()) {
				temp = 1;
			}
			else {
				temp = 2;
			}
		}
		else if (this.month != other.getMonth()) {
			if ( this.month > other.getMonth()) {
				temp = 1;
			}
			else {
				temp = 2;
			}
		}
		else if (this.day != other.getDay()) {
			if (this.month > other.getDay()) {
				temp = 1;
			else {
				temp = 2;
			}
			}
		}
		else { 
		return 0;
		}
				
		Switch(temp) {
			case (1): 
			tempDay = other.getDay();
			tempMonth = other.getMonth();
			tempYear = other.getYear();
			tempDay2 = this.day;
			tempMonth2 = this.month;
			tempYear2 = this.year;
			break;
			case (2): 
			tempDay = this.day;
			tempMonth = this.month;
			tempYear = this.year;
			tempDay2 = other.getDay();
			tempMonth2 = other.getMonth();
			tempYear2 = other.getYear();
		}
		
		int numDays = 0
		
		while (tempDay != tempDay2) {
			tempDay++
			numDays++
		}
		while (tempMonth != tempMonth2) {
			
			if (tempMonth == 2) {
				tempMonth++;
				numDays+= 28;
			}
			else if ((tempMonth) == (4 || 6 || 9 || 11)) {  
				tempMonth++
				numDays+=30;
			}
			else if ((tempMonth == (1 || 3 || 5 || 7 || 8 || 10)) {
				tempMonth++;
				numDays+=31;
			}
			else if (tempMonth == 12) {
				tempMonth = 1;
				tempYear++;
				numDays+= 31;
			}
		}	
			while(tempYear != tempYear2) {
			numDays+=365;
			tempYear++;	
			}
		return numDays;
	}
		
	
	public int getDay() {
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String toString() {
		return this.year + "/" + this.month + "/" + this.day;
	}