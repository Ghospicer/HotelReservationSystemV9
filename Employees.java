
public class Employees implements Calculable{
	
	String name;
	String surname;
	double monthlyPayment;
	int id;

	public Employees(String name, String surname, int id, double monthlyPayment) {
		this.name=name;
		this.surname=surname;
		this.monthlyPayment=monthlyPayment;
		this.id=id;
	}
	
	public double getCost() {
		return monthlyPayment;
	}

}
