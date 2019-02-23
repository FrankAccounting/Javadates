package chapter4;

public enum team {
	
	
			BUCKS("Milwaukee", "MIL"), 
			CLIPPERS("Place2", "Pla1"), 
			SPURS("Place2", "Pl2"), 
			BULLS("Place3", "Pl3"), 
			WIZARDS("Place4", "Pl4");
	
	
			String location;
			String name;
			
			public String getLocation() {
				return location;
			}

			public String getName() {
				return name;
			}

			team (String location, String name) {
			this.location = location;
			this.name = name;
			}
				
		}


