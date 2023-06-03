

public class Reservation extends Services implements Comparable<Reservation>{

    private String hotelName;
    private String reservationMonth;
    private int reservationStart;
    private int reservationEnd;
    private int dailyCost;
    public int totalDay;
    public String roomType;
    public int multiplier = 2;
    public String s1 = "June";
    public String s2 = "July";
    public String s3 = "August";
    public Room room;
    public String cityName;
    
    public String getServiceType() {
    	return "Room";
    }
    
    public double calculateService() {
    	return totalDay * dailyCost;
    }

    public int getDailyCost() {
        return dailyCost;
    }

    public void setDailyCost(int dailyCost) {
        this.dailyCost = dailyCost;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getReservationMonth() {
        return reservationMonth;
    }

    public void setReservationMonth(String reservationMonth) {
        this.reservationMonth = reservationMonth;
    }

    public int getReservationStart() {
        return reservationStart;
    }

    public void setReservationStart(int reservationStart) {
        this.reservationStart = reservationStart;
    }

    public int getReservationEnd() {
        return reservationEnd;
    }

    public void setReservationEnd(int reservationEnd) {
        this.reservationEnd = reservationEnd;
    }

    /*public Reservation(int reservationEnd, int reservationStart, String reservationMonth, String hotelName, String cityName, Room room, int CustomerID) {
    	super(CustomerID);
    	this.cityName = cityName;
    	this.hotelName = hotelName;
        this.reservationMonth = reservationMonth;
        this.reservationStart = reservationStart;
        this.reservationEnd = reservationEnd;
        this.room = room;
    }*/
    
    public Reservation(int reservationEnd, int reservationStart, String reservationMonth, String hotelName, String cityName, Room room, int CustomerID) {
    	super(CustomerID);
    	this.cityName = cityName;
    	this.hotelName = hotelName;
        this.reservationMonth = reservationMonth;
        this.reservationStart = reservationStart;
        this.reservationEnd = reservationEnd;
    }
    

    public int checker() {
    	if(reservationMonth.equals(s1)||reservationMonth.equals(s2)||reservationMonth.equals(s3)) {
			return calculate(totalDay(), room.RoomType(), multiplier);
		}
		else {
			return calculate(totalDay(), room.RoomType());
		}
    }
    
    public int calculate(int totalDay, int dailyCost, int multiplier) {
    	return totalDay * dailyCost * multiplier;
    }
    
    public int calculate(int totalDay, int dailyCost) {
    	return totalDay * dailyCost;
    }

    public int totalDay() {
        return totalDay = reservationEnd - reservationStart;
    }

    /*public String displayInfo() {
        return "Reservation for a " + room.getRoomType() 
        		+ " room in " + hotelName + " starts on "
        		+ reservationMonth + " " + reservationStart 
        		+ " and ends on " + reservationMonth + 
        		" " + reservationEnd + ". Reservation has a " 
        		+ "total cost of $" + checker() + ".";
    }*/
    
    public String displayInfo() {
        return "Reservation ID #" + CustomerID + "\n"
        		+ "Reservation at " + hotelName + 
        		" starts on " + reservationMonth + " " +
        		reservationStart + " " + "and ends on " +
        		reservationMonth + " " + reservationEnd +"."; 
    }
    
    public double getCost() {
		return checker();
	}

	@Override
	public int compareTo(Reservation o1) {
		return o1.getHotelName().compareTo(getHotelName());
	}



}