
public class Laundry extends Services{
	
	public int clothingPieces;
	public double laundryCost = 20;

	public Laundry(int CustomerID, int clothingPieces) {
		super(CustomerID);
		this.clothingPieces=clothingPieces;
	}
	
	String getServiceType() {
		return "Laundry";
	}
	
	double calculateService() {
		return clothingPieces * laundryCost;
	}
	
	public double getCost() {
		return calculateService();
	}

}
