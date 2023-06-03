
public enum MenuOptions {
	
	FIRST("1. Create new Reservation with Room Type"),
	SECOND("2. Display all Reservations"),
	THIRD("3. List the reservations for a specific city"),
	FOURTH("4. Add extra services to a reservation"),
	FIFTH("5. Calculate total cost for each service"),
	SIXTH("6. Display the total cost of every customer"),
	SEVEN("7. Add an Employee"),
	EIGHT("8. Add a Bill"),
	NINE("9. Get Monthly Balance"),
	TEN("10. List all Services sorted based on cost"),
	ELEVEN("11. List all Reservations sorted based on hotel names"),
	EXIT("12. Exit"),
	SINGLE("Room Type: Single, Daily Cost: 100, Room Size: 15, Has Bath: false."),
	DOUBLE("Room Type: Double, Daily Cost: 180, Room Size: 30, Has Bath: false."),
	CLUB("Room Type: Club, Daily Cost: 250, Room Size: 45, Has Bath: true."),
	FAMILY("Room Type: Family, Daily Cost: 400, Room Size: 50, Has Bath: false."),
	FAMILYWITHVIEW("Room Type: Family With View, Daily Cost: 450, Room Size: 50, Has Bath: true."),
	SUITE("Room Type: Suite, Daily Cost: 650, Room Size: 80, Has Bath: true.");
			
	
	
	MenuOptions(String menuOptions){
		this.menuOptions = menuOptions;
		
	}
	
	public String menuOptions;
	
	public String menuOptions(){
		return menuOptions;
	}

}



