package com.xworkz.interaction.boot;

import com.xworkz.interaction.Governer.BMRCL;
import com.xworkz.interaction.follower.Passengers;
import com.xworkz.interaction.rules.MetroRules;

public class BMRCLRunner {

		public static void main(String[] args) {
			MetroRules metro = new Passengers();
			BMRCL bmrcl = new BMRCL(metro);
			bmrcl.departure();

		}


}
