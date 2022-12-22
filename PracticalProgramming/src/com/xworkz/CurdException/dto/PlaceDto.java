package com.xworkz.CurdException.dto;

import java.time.LocalDateTime;

public class PlaceDto {
	public class PlaceDTO extends AbstractAudit {
		private String placeHesru;
		private Double famousFor;
		private String famousDish;
		private String busStands;
		private String famousSweet;

		public PlaceDTO() {
			System.out.println("Running the No Arguments constructor");
		}

		public PlaceDTO(String placeHesru, Double famousFor, String famousDish, String busStands, String famousSweet,
				String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
			super(createdBy, createdDate, updatedBy, updatedDate);
			this.placeHesru = placeHesru;
			this.famousFor = famousFor;
			this.famousDish = famousDish;
			this.busStands = busStands;
			this.famousSweet = famousSweet;
		}

		/**
		 * @return the placeHesru
		 */
		public String getPlaceHesru() {
			return placeHesru;
		}

		/**
		 * @param placeHesru the placeHesru to set
		 */
		public void setPlaceHesru(String placeHesru) {
			this.placeHesru = placeHesru;
		}

		/**
		 * @return the famousFor
		 */
		public Double getFamousFor() {
			return famousFor;
		}

		/**
		 * @param famousFor the famousFor to set
		 */
		public void setFamousFor(Double famousFor) {
			this.famousFor = famousFor;
		}

		/**
		 * @return the famousDish
		 */
		public String getFamousDish() {
			return famousDish;
		}

		/**
		 * @param famousDish the famousDish to set
		 */
		public void setFamousDish(String famousDish) {
			this.famousDish = famousDish;
		}

		/**
		 * @return the busStands
		 */
		public String getBusStands() {
			return busStands;
		}

		/**
		 * @param busStands the busStands to set
		 */
		public void setBusStands(String busStands) {
			this.busStands = busStands;
		}

		/**
		 * @return the famousSweet
		 */
		public String getFamousSweet() {
			return famousSweet;
		}

		/**
		 * @param famousSweet the famousSweet to set
		 */
		public void setFamousSweet(String famousSweet) {
			this.famousSweet = famousSweet;
		}

		

}
