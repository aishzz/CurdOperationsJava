package com.xworkz.equals;

public class Institution {
	
		private String name;
		private String owner;
		private long fees;
		private int totalStudents;
		private char Code;
		private String principalName;
		private String location;
		private long totalIncome;
		private boolean good;
		private int totalBranches;

		public Institution() {
			System.out.println("default constructor of the Institution");
		}

		public Institution(String name, String owner, long fees, int totalStudents, char code, String principalName,
				String location, long totalIncome, boolean good, int totalBranches) {
			super();
			this.name = name;
			this.owner = owner;
			this.fees = fees;
			this.totalStudents = totalStudents;
			Code = code;
			this.principalName = principalName;
			this.location = location;
			this.totalIncome = totalIncome;
			this.good = good;
			this.totalBranches = totalBranches;
		}

		@Override
		public String toString() {
			return "Institution [name=" + name + ", owner=" + owner + ", fees=" + fees + ", totalStudents=" + totalStudents
					+ ", Code=" + Code + ", principalName=" + principalName + ", location=" + location + ", totalIncome="
					+ totalIncome + ", good=" + good + ", totalBranches=" + totalBranches + "]";
		}

		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Institution) {
				Institution institution3=(Institution)obj;
				System.out.println("obj is instance of institution");
				if (this.principalName.equals(institution3.principalName) && this. owner.equals(institution3.owner) ) {
					System.out.println("type and principal name  are same");
					return true;
				} else {
					System.err.println("location ,md name,type and name  are not same ");
					return false;
				}
			} else {
				System.err.println("obj is not a instance of hospital");
			}

			return super.equals(obj);
			

		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return owner;
		}

		public void setType(String type) {
			this.owner = type;
		}

		public long getFees() {
			return fees;
		}

		public void setFees(long fees) {
			this.fees = fees;
		}

		public int getTotalStaffs() {
			return totalStudents;
		}

		public void setTotalStaffs(int totalStudents) {
			this.totalStudents = totalStudents;
		}

		public char getCode() {
			return Code;
		}

		public void setCode(char code) {
			Code = code;
		}

		public String getPrincipalName() {
			return principalName;
		}

		public void setPrincipalName(String principalName) {
			this.principalName = principalName;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public long getTotalRevenue() {
			return totalIncome;
		}

		public void settotalIncome(long totalRevenue) {
			this.totalIncome = totalIncome;
		}

		public boolean isGood() {
			return good;
		}

		public void setGood(boolean good) {
			this.good = good;
		}

		public int getTotalBranches() {
			return totalBranches;
		}

		public void setTotalBranches(int totalBranches) {
			this.totalBranches = totalBranches;
		}

}
