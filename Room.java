
public class Room {
        public String roomType = "Single";
        public int dailyCost;
        public int roomSize;
        public boolean hasBath;

        public int getDailyCost() {
            return dailyCost;
        }
        public void setDailyCost(int dailyCost) {
            this.dailyCost = dailyCost;
        }
        public String getRoomType() {
			return roomType;
		}
		public void setRoomType(String roomType) {
			this.roomType = roomType;
		}
                
		public Room(String roomType) {
        	this.roomType = roomType;
        }
        
        public Room(int dailyCost, int roomSize, boolean hasBath) {
        	this.dailyCost = dailyCost;
        	this.roomSize = roomSize;
        	this.hasBath = hasBath;
        }
        
        public int RoomType() {
        	
        	if(roomType.equalsIgnoreCase("Single")){
        		return dailyCost= Single.dailyCostS;
        		
        	}
        	else if(roomType.equalsIgnoreCase("Double")) {
        		return dailyCost= Double.dailyCost;
        		
        	}
        	else if(roomType.equalsIgnoreCase("Club")) {
        		return dailyCost= Club.dailyCost;
        		
        	}
        	else if(roomType.equalsIgnoreCase("Family")) {
        		return dailyCost= Family.dailyCost;
        		
        	}
        	else if(roomType.equalsIgnoreCase("FamilywithView")) {
        		return dailyCost= FamilywithView.dailyCost;
        		
        	}
        	else if(roomType.equalsIgnoreCase("Suite")) {
        		return dailyCost= Suite.dailyCost;
        		
        	}
        	else {
        		return dailyCost;
        	}
			
        }

    }