package com.xworkz.bigfish.newfile;

import com.xworkz.bigfish.boot.Lipstick;

public class LipstickRunner {

	public static void main(String[] args) {
		String[]  type = { "Dark", "nude" };
		String[]  size = { "large", "medium", "small", "pencil" };
		String[] manufactureName = { "Mr.Bommai", "Mr.Siddaramanna", "Mr. Kuamaranna", "Ms.Anitha Kumaranna" };
		long[] manufactureNumber = { 7859996956l, 9658545632l, 9875963852l, 8412652563l };
		String[] lipstickAmbasider = {  "RASHMIKA", "VIRAT" };
	

		Object colour;
		String[] price = null;
		String[] brand = null;
		String[] name = null;
		String[] city = null;
		Lipstick lipstick = new Lipstick(null, null, null, 0, null, name, city,
				brand, price);
		Lipstick.name = "lakme";
		Lipstick.city = "Bengaluru";
		Lipstick.brand = "lakme120";
		Lipstick.price = 860;
		Lipstick.colour= "red";

	}

}
