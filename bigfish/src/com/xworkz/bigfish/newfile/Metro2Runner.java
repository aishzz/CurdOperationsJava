package com.xworkz.bigfish.newfile;

import com.xworkz.bigfish.boot.Metro2;

public class Metro2Runner {

	public static void main(String[] args)
	{
	
		String[] routes = { "Purple line", "Green line" };
		String[] metroStationNames = { "Nagasandra", "Jalahalli Cross", "Peenya", "GoraguntePalya" };
		String[] stationMangerName = { "Mr.Bommai", "Mr.Siddaramanna", "Mr. Kuamaranna", "Ms.Anitha Kumaranna" };
		long[] stationManagerNumber = { 7859996956l, 9658545632l, 9875963852l, 8412652563l };
		String[] finalStops = { "Nagasandra", "Baiyapanahalli", "Silk Factory", "Kengeri" };
		String[] metroTimings = { "5am - 11pm", "7am - 11pm" };

		Metro2 metro2 = new Metro2(null, null, null, null, 0, routes, metroStationNames, stationMangerName,
				stationManagerNumber, finalStops, metroTimings);
		metro2.name = "Namma Metro";
		metro2.city = "Bengaluru";
		metro2.state = "Karnataka";
		metro2.country = "INDIA";
		metro2.countryCode = 91;

		metro2.display();

	}



	}

