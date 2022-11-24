package com.xworkz.equals;

public class God {
	
		private String name;
		private String originalName;
		private int totalChildren;
		private char godFav;
		private String location;
		private int totalArea;
		private String poojari;
		private double entryFees;
		private boolean powerFull;
		private String poojariWife;

		public God() {
			System.out.println("default  God");
		}

		public God(String name, String originalName, int totalChildren, char godFav, String location, int totalArea,
				String poojari, double entryFees, boolean powerFull, String poojariWife) {
			super();
			this.name = name;
			this.originalName = originalName;
			this.totalChildren = totalChildren;
			this.godFav = godFav;
			this.location = location;
			this.totalArea = totalArea;
			this.poojari = poojari;
			this.entryFees = entryFees;
			this.powerFull = powerFull;
			this.poojariWife = poojariWife;
		}

		@Override
		public String toString() {
			return "God [name=" + name + ", originalName=" + originalName + ", totalChildren=" + totalChildren + ", godFav="
					+ godFav + ", location=" + location + ", totalTemples=" + totalArea + ", poojari=" + poojari
					+ ", entryFees=" + entryFees + ", powerFull=" + powerFull + ", poojariWife=" + poojariWife + "]";
		}

		@Override
		public boolean equals(Object obj) {
			if(obj instanceof God) { //checking about instance of
		    	 System.out.println("obj is the instance of currancy ");
		    	 God god3=(God)obj; 
		    	 if(this.location.equals(god3.location) && this.name.equals(god3.name) &&this.originalName.equals(god3.originalName))
		    	 {
		    		 System.out.println("location ,original and name  are same");
		    		 return true;
		    	 }else {
		    		 System.err.println("location ,original and name  are not same ");
		    		 return false;
		    	 }
		     }
		     else {
		    	 System.err.println("obj is not a instance of currancy");
		     }
			return super.equals(obj);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOriginalName() {
			return originalName;
		}

		public void setOriginalName(String originalName) {
			this.originalName = originalName;
		}

		public int getTotalDieties() {
			return totalChildren;
		}

		public void setTotalDieties(int totalDieties) {
			this.totalChildren = totalDieties;
		}

		public char getGodFav() {
			return godFav;
		}

		public void setGodCode(char godFav) {
			this.godFav = godFav;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public int getTotalTemples() {
			return totalArea;
		}

		public void setTotalTemples(int totalTemples) {
			this.totalArea = totalTemples;
		}

		public String getpoojari() {
			return poojari;
		}

		public void setPriestName(String poojari) {
			this.poojari = poojari;
		}

		public double getEntryFees() {
			return entryFees;
		}

		public void setEntryFees(double entryFees) {
			this.entryFees = entryFees;
		}

		public boolean isPowerFull() {
			return powerFull;
		}

		public void setPowerFull(boolean powerFull) {
			this.powerFull = powerFull;
		}

		public String getGodPoojaName() {
			return poojariWife;
		}

		public void setGodPoojaName(String godPoojaName) {
			this.poojariWife = godPoojaName;
		}

	
}
