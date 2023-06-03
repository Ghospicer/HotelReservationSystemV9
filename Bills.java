
public class Bills implements Calculable{
	
	String type;
	double amount;
	String month;

	public Bills(String type, double amount, String month) {
		this.type=type;
		this.amount=amount;
		this.month=month;
	}
	
	public double getCost() {
		return amount;
	}

}
