
public class Spa extends Services {
	
	public int days;
	public double spaCost = 100;

	public Spa(int CustomerID, int days) {
		super(CustomerID);
		this.days=days;
	}
	
	String getServiceType() {
		return "Spa";
	}
	
	double calculateService() {
		return days * spaCost;
	}
	
	public double getCost() {
		return calculateService();
	}

}
