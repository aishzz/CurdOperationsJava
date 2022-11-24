package com.xworkz.equals;

public class Hospital {
	
		private String name;
		private String type;
		private double price;
		private int totalStaffs;
		private char hospitalCode;
		private String mdName;
		private String area;
		private long totalIncome;
		private boolean good;
		private int totalBranches;

		public Hospital() {
			System.out.println("default constructor of the currency");
		}

		public Hospital(String name, String type, double price, int totalStaffs, char hospitalCode, String mdName,
				String area, long totalIncome, boolean good, int totalBranches) {
			super();
			this.name = name;
			this.type = type;
			this.price = price;
			this.totalStaffs = totalStaffs;
			this.hospitalCode = hospitalCode;
			this.mdName = mdName;
			this.area = area;
			this.totalIncome = totalIncome;
			this.good = good;
			this.totalBranches = totalBranches;
		}

		@Override
		public String toString() {
			return "Hospital [name=" + name + ", type=" + type + ", price=" + price + ", totalStaffs=" + totalStaffs
					+ ", hospitalCode=" + hospitalCode + ", mdName=" + mdName + ", area=" + area + ", totalIncome="
					+ totalIncome + ", good=" + good + ", totalBranches=" + totalBranches + "]";
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Hospital) { 
				System.out.println("obj is the instance of Hospital");
				Hospital hospital3 = (Hospital) obj; 
				if (this.name.equals(hospital3.name) && this.area.equals(hospital3.area)
						&& this.mdName.equals(hospital3.mdName) && this.type.equals(hospital3.type)) {
					System.out.println("location ,md name,type and name  are same");
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
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public double getCharges() {
			return price;
		}

		public void setCharges(double charges) {
			this.price = charges;
		}

		public int getTotalStaffs() {
			return totalStaffs;
		}

		public void setTotalStaffs(int totalStaffs) {
			this.totalStaffs = totalStaffs;
		}

		public char getHospitalCode() {
			return hospitalCode;
		}

		public void setHospitalCode(char hospitalCode) {
			this.hospitalCode = hospitalCode;
		}

		public String getMdName() {
			return mdName;
		}

		public void setMdName(String mdName) {
			this.mdName = mdName;
		}

		public String getArea() {
			return area;
		}

		public void setLocation(String location) {
			this.area = location;
		}

		public long getTotalRevenue() {
			return totalIncome;
		}

		public void setTotalRevenue(long totalRevenue) {
			this.totalIncome = totalRevenue;
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
