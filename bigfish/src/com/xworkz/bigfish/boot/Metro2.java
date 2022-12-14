package com.xworkz.bigfish.boot;

public class Metro2 {

		public String name;
		public String city;
		public String state;
		public String country;
		public int countryCode;

		public String[] routes;
		public String[] metroStationNames;
		public String[] stationMangerName;
		public long[] stationManagerNumber;
		public String[] finalStops;
		public String[] metroTimings;

		public Metro2(String name, String city, String state, String country, int countryCode, String[] routes,
				String[] metroStationNames, String[] stationMangerName, long[] stationManagerNumber, String[] finalStops,
				String[] metroTimings) {

			this.name = name;
			this.city = city;
			this.state = state;
			this.country = country;
			this.countryCode = countryCode;

			this.routes = routes;
			this.metroStationNames = metroStationNames;
			this.stationMangerName = stationMangerName;
			this.stationManagerNumber = stationManagerNumber;
			this.finalStops = finalStops;
			this.metroTimings = metroTimings;

		}

		public Metro2(Object name2, Object city2, Object state2, Object country2, int countryCode2, String[] routes2,
				String[] metroStationNames2, String[] stationMangerName2, long[] stationManagerNumber2,
				String[] finalStops2, String[] metroTimings2) {
			
		}

		public void display() {
			System.out.println("Name : " + this.name);
			System.out.println("City : " + this.city);
			System.out.println("State : " + this.state);
			System.out.println("Country : " + this.country);
			System.out.println("Country Code :" + this.countryCode);

			Sintln(System.lineSeparator() + "====Routes====");ystem.out.pr
			for (int i = 0; i < routes.length; i++) {
				String string = routes[i];
				System.out.println(string);
			}
			System.out.println(System.lineSeparator() + "====Metro Station Names====");
			for (int i = 0; i < metroStationNames.length; i++) {
				String string = metroStationNames[i];
				System.out.println(string);

			}
			System.out.println(System.lineSeparator() + "====Station Manger Names====");
			for (int i = 0; i < stationMangerName.length; i++) {
				String string = stationMangerName[i];
				System.out.println(string);
			}

			System.out.println(System.lineSeparator() + "====Station Manager Numbers====");
			for (int i = 0; i < stationManagerNumber.length; i++) {
				long l = stationManagerNumber[i];
				System.out.println(l);
			}
			System.out.println(System.lineSeparator() + "====Final Stops====");
			for (int i = 0; i < finalStops.length; i++) {
				String string = finalStops[i];
				System.out.println(string);
			}
			System.out.println(System.lineSeparator() + "====Metro Timings====");
			for (int i = 0; i < metroTimings.length; i++) {
				String string = metroTimings[i];
				System.out.println(string);
			}
		}
	}

